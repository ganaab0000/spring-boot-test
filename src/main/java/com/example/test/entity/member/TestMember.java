package com.example.test.entity.member;

// 엔티티: 핵심 업무 규칙
// 무슨뜻이냐 ?
// 엔티티의 변경이 발생하면 모든것이 박살난다는 뜻
// 회사에서 10 명이 일을 하고 있습니다.
// 데이터 A가 있고 데이터 B가 있음
// 사람 1번 ~ 10번까지 함께 개발을 하고 있음
// 사람 1번 ~ 10번까지는 모두 열심히
// 데이터 A와 데이터 B를 사용해서 매서드 및 클래스를 많이 만들었습니다.
// 매서드가 1000개 만들어지고 클래스가 100개 만들어짐
// 갑자기 사람 9번이 데이터 A를 변경하였습니다.
// 무슨 일이 벌어질까요 ?

// 9번이 데이터 A를 변경함으로써 9번이 동작시킬려고한 프로그램은 잘 ~ 동작합니다.
// 근대 이전에 9번을 제외한 나머지 9명이 만든 프로그램은 어떻게 될까요 ? 초토화

// 이와 같은 상황을 미연에 방지하기 위해
// 엔티티는 정말 특수한 상황을 제외하고는 변경하지 않는다.
// 만약 변경이 불가피하다면 반드시 팀장님과 논의를 하고 회의를 거쳐 작업을 진행하도록 합니다.
// 답이 안나온다면 어쩔 수 없습니다.

import lombok.Getter;
import lombok.Setter;

import java.util.*;

// Lombok: 클래스에 대한 객체 생성과 관련된 일련의 작업을 편리하게 만들어주는 어노테이션
@Getter
@Setter
public class TestMember {
    private String userName = "sdr4linux";
    private String password = "123456";
    private Integer [] numLIst = {1,2,3,7,9,11,13};
    private List<Integer> numLinkedLIst = Arrays.asList(new Integer[]{11,13});
    private Map<String, String> hashMap = new HashMap<>();

    public TestMember() {
        hashMap.put("Rice", "34");
        hashMap.put("Rice2", "34");
    }

    public String test(){
        return "test";
    }

    // Alt + Insert
    // Alt + Shift + Insert
}
