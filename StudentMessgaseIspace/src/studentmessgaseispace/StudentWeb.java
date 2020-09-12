/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmessgaseispace;

import java.util.Date;

/**
 *
 * @author SANG
 */
public class StudentWeb extends Student{
    private double php1;
    private double php2;

    public StudentWeb() {
    }

    public StudentWeb(double php1, double php2, int id, String name, boolean gender, Date birthay, double sql, double english) {
        super(id, name, gender, birthay, sql, english);
        this.php1 = php1;
        this.php2 = php2;
    }

    public double getPhp1() {
        return php1;
    }

    public void setPhp1(double php1) {
        this.php1 = php1;
    }

    public double getPhp2() {
        return php2;
    }

    public void setPhp2(double php2) {
        this.php2 = php2;
    }

    @Override
    public double sum() {
        return getEnglish() + getSql() + getPhp1() + getPhp2();
    }

    @Override
    public double avg() {
        return sum() / 4;
    }
    
    
    
}
