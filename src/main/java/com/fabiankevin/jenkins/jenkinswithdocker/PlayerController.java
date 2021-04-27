package com.fabiankevin.jenkins.jenkinswithdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("players")
public class PlayerController {

    @GetMapping
    List<Player> getPlayers(){
        Random random = new Random();
        return Arrays.asList(
            Player.builder()
                    .id( random.nextLong() )
                    .name("Chotto matte")
                    .character(
                            Character.builder()
                                    .id(random.nextLong())
                                    .name("Sniper")
                                    .build()
                    )
                    .build(),
                Player.builder()
                        .id( random.nextLong() )
                        .name("Yuna")
                        .character(
                                Character.builder()
                                        .id(random.nextLong())
                                        .name("Priest")
                                        .build()
                        )
                        .build(),
                Player.builder()
                        .id( random.nextLong() )
                        .name("Bulbasaur")
                        .character(
                                Character.builder()
                                        .id(random.nextLong())
                                        .name("Shielder")
                                        .build()
                        )
                        .build()
        );
    }
}
