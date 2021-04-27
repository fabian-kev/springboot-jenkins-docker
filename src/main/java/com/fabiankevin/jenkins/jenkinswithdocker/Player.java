package com.fabiankevin.jenkins.jenkinswithdocker;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Player {
    private Long id;
    private String name;
    private Character character;
    private List<String> skills;
}

@Data
@Builder
class Character {
    private Long id;
    private String name;

}


