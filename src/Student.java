public class Student implements Comparable{
    int sid;
    String sname;
    int score;

    public Student(int sid, String sname, int score) {
        this.sid = sid;
        this.sname = sname;
        this.score = score;
    }

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public int getScore() {
        return score;
    }

    //Sort using score
    @Override
    public int compareTo(Object o) {
        Student std = (Student) o;
        Integer sScore = score;
        Integer stdScore = std.score;
        return sScore.compareTo(stdScore) * -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Student)) return false;
        Student student = (Student) o;
        return score == student.score && sid == student.sid && sname.equalsIgnoreCase(student.sname);

    }

    @Override
    public String toString() {
        return
                "sid: " + sid +
                ", sname:'" + sname + '\'' +
                ", score: " + score +
                 "\n";
    }
}
