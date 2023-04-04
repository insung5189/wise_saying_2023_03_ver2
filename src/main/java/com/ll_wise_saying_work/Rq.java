package com.ll_wise_saying_work;

import java.util.HashMap;

public class Rq {
    private String actionCode; // Rq생성자 내부에서 commandBits[0]으로 할당해서 해당 명령의 액션코드를 나타냄 (삭제?id=1 혹은 수정?id=1을 입력하면 삭제 혹은 수정 만 골라서 출력됨.)
    private HashMap<String, String> params; // 잘라놓은 문자열을 key와 value값으로 접근하기 위하여 HashMap<String, String>타입으로 params라는 변수를 선언해줌.

    public Rq(String command) { // App클래스에서 command변수로 스캐너 입력받은 문자열을 처리하는 로직
        String[] commandBits = command.split("\\?", 2); // regex : regular expression(?)
        // command변수에 해당하는 문자열을 물음표 기준으로 '2'개로 나누어서 commandBits 변수에 넣겠다는 뜻 (삭제?id=1&id=2 => 삭제  ?  id=1&id=2)
        this.actionCode = commandBits[0]; // 위에서 .split을 이용해서 command변수의 문자열을 나누어서 배열에 할당하였다.
        // 삭제?id=1 => commandBits = {"삭제", "id=1&id=2"} 이 중 commandBits[0] = "삭제" , commandBits[1] = "id=1&id=2"

        if (commandBits.length == 1) return; // command변수 안에 문자열에 '?'가 있다면 해당 문자열이 나뉘어서 commandBits 배열의 총 길이가 2이상이 되겠지만,
        // 문자열안에 '?'(파라미터)가 없어서 문자열을 나누지 못하고 배열의 길이가 1일때 (예 : 등록, 목록, 종료 등..) 바로 종료(return;)시키겠다 라는 예외처리 로직.
        params = new HashMap<>(); // private로 선언된 HashMap<String, String>타입 변수 params에 HashMap기능 할당해줌.

        String[] paramsBits = commandBits[1].split("&"); // 같은 카테고리레벨(명언번호)에선 &를 기준으로 무한정 나눌 수 있기 때문에 따로 제한 수를 두지 않음.
        // 위에서 나눠진 command문자열중 commandBits 배열 1번 인덱스로 들어간 물음표 이후 부분 (예 : "id=1&id=2")을 .split기능을 이용해서 &문자를 기준으로 나누고,
        // 그렇게 나눠진 문자열을 또 paramBits배열에 넣어줌. paramBits = {"id=1", "id=2"}


        // hashmap을 불러올 땐 key로 접근이 가능하다.
        // id = 1;
        // remove로 넘겨서 id값 1 삭제 실행. 하는 구조임.
        // 삭제?id(key)=1(value)&id(key)=2(value)
        // ? = 키워드로 나누겠다는 뜻
        // & = 같은 레벨 안에서 그리고,의 느낌.

        // 물음표 기준으로 '2'개로 나눴던 것들 == '삭제?id=1&id=2 => 삭제  ?  id=1  &  id=2' 을 한번더 &기준으로 나누는 과정.

        for (String paramsStr : paramsBits) { // 나눈 key(id)와 value(id번호)를 나눠준 후 처리하는 로직
            // 위에서 나누어진 문자열배열(paramBits)을 foreach문을 통해서 각 인덱스를 한 번씩 순회하여 paramsStr배열에 넣어주고,
            // 아래 로직을 통해서 paramsStr배열에 넣어준 문자열들 각각을 '=' 기준으로 둘로 나누어준다
            String[] paramsStrBits = paramsStr.split("=", 2); // 파라미터(매개변수)를 받겠다는 의미
            // paramsStr = {"id=1", "id=2"} => paramStrBits = {"id", "1"}   {"id", "2"}
            // 이렇게 나눠준 paramStrBits 배열의 값을 위에서 선언해준 HashMap 기능을 이용해서 key와 value로 받아야 함.

            if (paramsStrBits.length == 1) {
                continue;
            } // 안전상 넣어준 조건문. 지워도 상관없지만 명령어의 마지막이 정수로 끝나지 않을 때 나는 에러를 방지하도록

            String key = paramsStrBits[0]; // key 명목으로 paramStrBits 배열인덱스 [0]에 접근 => 배열상 실제값 = id
            String value = paramsStrBits[1]; // value 명목으로 paramStrBits 배열인덱스 [1]에 접근 = 배열상 실제값 = 1 or 2
            System.out.println("키 : " + key + "값 : " + value);
            params.put(key, value); // params에 키, 벨류값으로 담는 것.
                    /* 출력
                    명령(등록, 목록, 종료, 삭제, 수정) : 삭제?id=1&id=2
                    키 : id 값 : 1
                    키 : id 값 : 2
                    */
            // 'id=1  &  id=2' 을 '='을 기준으로 해당 id값을 key로, 넘버 값을 value로 나누는 과정.
        }
        System.out.println(params); // key와 value값이 담긴 가변배열 params를 출력함.
    }

    public String getActionCode() { // actionCode라는 변수를 지정해줘서 명령애 따른 액션코드를 출력하도록 함.
        return this.actionCode; // commandBits[0]이 할당된 actionCode를 반환하도록 함.
    }

    public String getParams(String name) {
        return params.get(name);
    }

    public int getIntParam(String name, int defaultValue) {
        try { // 정수가 아닌 값을 입력했을때 검증하는 예외처리문.
            return Integer.parseInt(getParams("id")); // id값이 현재 params배열상 String으로 되어있기 때문에 parseInt로 형변환 해줌.
        } catch (NumberFormatException e) { // NumberFormatException e : 숫자가 아닌경우
            System.out.println("숫자가 아닌 값이 들어와서 에러가 발생했습니다.");
            return defaultValue;
        }
    }
}