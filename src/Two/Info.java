package Two;

class Info {
    String Name;
    int Kor;
    int Eng;
    int Math;
    int add;
    double average;
    char rating;

    void input(String student){
        String[] parts = student.split(" ");
        Name = parts[0];
        Kor = Integer.parseInt(parts[1]);
        Eng = Integer.parseInt(parts[2]);
        Math = Integer.parseInt(parts[3]);
    }

    void result(){
        add = Kor + Eng + Math;
        average = (double) add /3;
    }

    void rating(double average) {
        if ( 90 < average && average <= 100) {
            rating = 'A';
        } else if (80 < average && average <= 90){
            rating = 'B';
        } else if (70 < average && average <= 80){
            rating = 'C';
        } else if (60 < average && average <= 70){
            rating = 'D';
        } else {rating = 'F';}
    }

    void output(){
        System.out.printf("%s의 점수\n국어: %d\n영어: %d\n수학: %d\n총점: %d  평균: %.3f  등급: %s\n"
                , Name, Kor, Eng, Math,add,average,rating);
    }
}