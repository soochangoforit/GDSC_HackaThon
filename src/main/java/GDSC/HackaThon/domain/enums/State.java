package GDSC.HackaThon.domain.enums;

import lombok.Getter;

/**
 * 인증 혹은 도난 상태
 */
@Getter
public enum State {

    AUTHENTICATED("인증"),
    NOT_AUTHENTICATED("미인증"),
    LOST("도난");

    private String name;

    private State(String name) {
        this.name = name;
    }

    // name to convert enum
    public static State nameToEnum(String name) {
        for (State state : State.values()) {
            if (state.getName().equals(name)) {
                return state;
            }
        }
        return null;
    }

}
