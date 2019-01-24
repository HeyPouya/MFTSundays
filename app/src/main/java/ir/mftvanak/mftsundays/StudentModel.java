package ir.mftvanak.mftsundays;

import com.orm.SugarRecord;
import com.orm.dsl.Table;
import com.orm.dsl.Unique;

@Table
public class StudentModel extends SugarRecord {


    String name;
    String family;
    int grade;

    public StudentModel() {
    }


    public StudentModel( String name, String family, int grade) {
        this.name = name;
        this.family = family;
        this.grade = grade;
    }
}
