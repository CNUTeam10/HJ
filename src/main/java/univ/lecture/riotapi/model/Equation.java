package univ.lecture.riotapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by tchi on 2017. 4. 1..
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Equation {
	private String input;
	private double result;
	private long now;
	private int teamID = 10;
    //private int summonerLevel;
}
