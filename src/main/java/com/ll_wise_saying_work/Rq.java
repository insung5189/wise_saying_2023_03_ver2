package com.ll_wise_saying_work;

import java.util.HashMap;

public class Rq {
    private String actionCode;
    private HashMap<String, String> params;

    public Rq(String command) { // App클래스에서 command변수로 받은 문자열을 처리하는 로직
        String[] commandBits = command.split("\\?", 2); // regex : regular expression(?)
        // 물음표 기준으로 '2'개로 나누겠다는 뜻 삭제?id=1 => 삭제  ?  id=1
        this.actionCode = commandBits[0];

        if (commandBits.length == 1) return; // commandBits의 배열길이가 '?'가 있다면 문자열이 나뉘어서 배열 길이가 2이상이 되겠지만,
        // 문자열안에 '?'(파라미터)가 없어서 배열의 길이가 1일때 (예 : 등록, 목록, 종료 등..) 바로 종료(return;)시키겠다 라는 예외처리 로직.
        params = new HashMap<>();

        String[] paramsBits = commandBits[1].split("&"); // 같은 카테고리레벨에선 무한정으로 나눌 수 있기 때문에 따로 제한 수를 두지 않음.


        // hashmap을 불러올 땐 key로 접근이 가능하다.
        // id = 1;
        // remove로 넘겨서 id값 1 삭제 실행. 하는 구조임.
        // 삭제?id(key)=1(value)&id(key)=2(value)
        // ? = 키워드로 나누겠다는 뜻
        // & = 같은 레벨 안에서 그리고,의 느낌.

        // 물음표 기준으로 '2'개로 나눴던 것들 == '삭제?id=1&id=2 => 삭제  ?  id=1  &  id=2' 을 한번더 &기준으로 나누는 과정.

        for (String paramsStr : paramsBits) { // 나눈 key(id)와 value(id넘버)를 나눠서 처리하는 로직
            String[] paramsStrBits = paramsStr.split("=", 2); // 파라미터(매개변수)를 받겠다는 의미
            // key와 value로 받아야 함.

            if (paramsStrBits.length == 1) {
                continue;
            } // 안전상 넣어준 조건문. 지워도 상관없지만 명령어의 마지막이 정수로 끝나지 않을 때 나는 에러를 방지하도록

            String key = paramsStrBits[0]; // key 명목으로 배열인덱스 [0]에 접근
            String value = paramsStrBits[1]; // value 명목으로 배열인덱스 [1]에 접근
            System.out.println("키 : " + key + "값 : " + value);
            params.put(key, value); // params에 키, 벨류값으로 담는 것.
                    /* 출력
                    명령(등록, 목록, 종료, 삭제, 수정) : 삭제?id=1&id=2
                    키 : id 값 : 1
                    키 : id 값 : 2
                    삭제?id =
                    */
            // 'id=1  &  id=2' 을 '='을 기준으로 해당 id값을 key로, 넘버 값을 value로 나누는 과정.
        }
        System.out.println(params);
                /*
                System.out.printf("삭제?di = "); // '명언 : '안내문
                String delete = Container.getScanner().nextLine().trim();
                */
    }

    public String getActionCode() {
        return this.actionCode;
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
//    return defaultValue;
    }
}