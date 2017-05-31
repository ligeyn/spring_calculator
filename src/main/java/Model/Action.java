package Model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Andrey on 31.03.2017.
 */

@Entity
@Table(name = "logs")
public class Action {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "left_part")
    private String leftPart;

    @Column(name = "right_part")
    private String rightPart;

    @Column(name = "mathAction")
    private String mathAction;

    @Column(name = "time")
    private Timestamp time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLeftPart() {
        return leftPart;
    }

    public void setLeftPart(String leftPart) {
        this.leftPart = leftPart;
    }

    public String getRightPart() {
        return rightPart;
    }

    public void setRightPart(String rightPart) {
        this.rightPart = rightPart;
    }

    public String getMathAction() {
        return mathAction;
    }

    public void setMathAction(String mathAction) {
        this.mathAction = mathAction;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public Action(String leftPart, String rightPart, String action) {

        this.leftPart = leftPart;
        this.rightPart = rightPart;
        this.mathAction = action;
        this.time = new Timestamp(System.currentTimeMillis());
    }

    public Action() {
    }
}
