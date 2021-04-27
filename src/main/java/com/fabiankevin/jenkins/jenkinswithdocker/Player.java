package com.fabiankevin.jenkins.jenkinswithdocker;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Player {
    private Long id;
    private String name;
    private Character character;
}

@Data
@Builder
class Character {
    private Long id;
    private String name;

}


