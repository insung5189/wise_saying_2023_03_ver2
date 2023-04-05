package pakcage1;

import java.util.HashMap;
import java.util.Map;

public class Rq {
    private String actionCode;
    private  Map<String, String> params;

    public Rq(String command) {
        command = Container.getScanner().nextLine().trim();
//        삭제 ? id = 1 & id = 2
        String[] deleteBits = command.split("\\?", 2); // deleteBits = {"삭제", "id=1&id=2"}
        actionCode = deleteBits[0]; // '삭제'가 될 거기 때문에 명령에 대한 액션코드로 사용이 가능.



        String[] paramBits = deleteBits[1].split("&"); // paramBits = {"id=1", "id=2"}

        params = new HashMap<>(); // key와 value를 처리하기 위한 HashMap 생성 및 인스턴스화.

        // 삭제와 수정은 명령문에 삭제?id=1, 수정?id=2 등으로 '?' 포함한다.
        // 하지만 이 밑으로 명령에 '?' 를 가지지 않은 명령문(종료, 등록, 목록, 도움말)에 대한 예외처리 로직이 필요함
        if (deleteBits.length == 1) { // 명령문에 ? 를 가지지 않아서 deleteBits배열의 길이가 1일떄
            return; // 위 조건이 참일때 아래 반복문(for)을 실행하지 않겠다.
        }

        // deleteBits[1]을 .split으로 나눠줄때 나누어질 문자열 덩어리의 제한수를 두지 않아서 일일이 값을 지정하고 처리하기 어려움.
        // paramBits의 배열의 길이가 얼마나 될 지 모르기 때문에 foreach 문을 사용해서 자동으로 해당배열 끝까지 참조 및 순회할 수 있도록 한다.
        for (String paramsStr : paramBits) { // paramBits의 배열의 각 값들을 '=' 기준으로 각각 2덩이로 나누어서 paramsStr변수에 넣어준다.
            // 여기서 paramsStr은 배열이 아님!! 반복문이 실행되면서 paramBits배열을 순회하는동안 나온 값이 잠깐씩 담기는 용도
            // 그렇게 paranBits배열의 값이 순차적으로 paramsStr에 담기는 행위가 반복됨
            String[] paramsStrBits = paramsStr.split("=", 2);
            // 그리고 그 paramsStr에 담긴 문자열을 '='을 기준으로 2덩이로 나눈 걸 paramsStrBits배열에 담음.
            // id=1 , id=2 , id=3 => {id, 1} , {id, 2} , {id, 3} 이런 형태가 됨.

            if (paramsStrBits.length == 1) { // deleteBits의 경우와 마찬가지로 명령문에 '=' 를 가지지 않아서 paramsStrBits배열의 길이가 1일떄
                continue; // 위 조건이 참일때 continue를 실행해라.
                // continue의 의미는 조건식이 참일경우 아래 로직을 실행하지 않고 다시 for문 시작으로 돌아가라는 뜻
            }

            String key = paramsStrBits[0]; // paramsStrBits의 0번 인덱스 = id = key
            String value = paramsStrBits[1]; // paramsStrBits의 1번 인덱스 = 번호값. = value
            // 이제 이 paramsStrBits을
            // paramsStrBits[0] = key
            // paramsStrBits[1] = value
            // 이런식으로 처리해서 HashMap에 넣어줄 것임.
            params.put(key, value); // .put을 이용해서 HashMap에 각각 key와 value값으로 지정된 변수들을 넣어줌.
        }
    }

    public String getActionCode() {
        return actionCode;
    }

    public String getParams(String name) { // 나중에 id로 접근할 수도 있고 authorName이나 content로 접근할 수도 있고 여러가지 key값으로 접근할 수 있기 때문에
//        매개변수값을 받아줄 매개변수를 넣어줘야 한다. 그리고 리턴값이 params.get(name); 즉 String 형태이기 때문에 Map<String, String>을 String으로 바꿔서 처리함.
        return params.get(name); // 이게 어떻게 작동하는지 이해가 잘 안됨.**
    }
}
