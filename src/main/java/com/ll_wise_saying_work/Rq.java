package com.ll_wise_saying_work;

import java.util.HashMap;

public class Rq {
    String actionCode;
    HashMap<String, String> params;
    Rq (String command) {
        String[] commandBits = command.split("\\?", 2); // regex : regular expression(?)
        // 삭제?id= 에서 2글자를 지나서 다음에 나오는 물음표 기준으로 나누겠다는 뜻
        this.actionCode = commandBits[0];

        if (commandBits.length == 1) return;
        params = new HashMap<>();

        String[] paramsBits = commandBits[1].split("&"); // 같은 카테고리레벨에선 무한정으로 나눌 수 있기 때문에 따로 제한 수를 두지 않음.
        // hashmap을 불러올 땐 key로 접근이 가능하다.
        // id = 1;
        // remove로 넘겨서 id값 1 삭제 실행. 하는 구조임.
        // 삭제?id(key)=1(value)&id(key)=2(value)
        // ? = 키워드로 나누겠다는 뜻
        // & = 같은 레벨 안에서 그리고,의 느낌.

        for (String paramsStr : paramsBits) {
            String[] paramsStrBits = paramsStr.split("=", 2); // 파라미터(매개변수)를 받겠다는 의미
            // key와 value로 받아야 함.
            String key = paramsStrBits[0]; // key 명목으로 배열인덱스 [0]에 접근
            String value = paramsStrBits[1]; // value 명목으로 배열인덱스 [1]에 접근
            System.out.println("키 : " + key + "값 : " + value);
            params.put(key, value);
                    /* 출력
                    명령(등록, 목록, 종료) : 삭제?id=1&id=2
                    키 : id값 : 1
                    키 : id값 : 2
                    삭제?id =
                    */
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
}
