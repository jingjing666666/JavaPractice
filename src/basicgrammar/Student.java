package basicgrammar;

/**
 * Created by yuanqingjing on 2017/12/28
 */
public class Student {
    int number;
    int state;
    int score;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", state=" + state +
                ", score=" + score +
                '}';
    }

    public void setScore(int score) {
        this.score = score;
    }
}
