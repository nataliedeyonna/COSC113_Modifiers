public class Student {
    //public class Main {

        public String FN;

        public String LN;

        public int Sid;

        private double gpa;



        Student(){
            this.FN = "No first name";
            this.LN = "No last name";
            this.Sid = 0;
            this.gpa = 0.0;
        }

        //Student(String FN, String LN) {
        //    this.FN = FN;
        //    this.LN = LN;
        // }

        Student(String FN, String LN) {
            this.FN = FN;
            this.LN = LN;
        }

        // How many parameters = 3
        Student(String FN, String LN, int Sid) {
            //  this.FN = FN;
            //  this.LN = LN;
            this(FN,LN);
            this.Sid = Sid;
        }

        Student(String FN, int Sid, String LN){
            this.FN = FN;
            this.LN = LN;
            this.Sid = Sid;
        }

        //Methods = Getters and Setters


        public String getFN() {
            return FN;
        }

        public void setFN(String FN) {
            this.FN = FN;
        }

        public String getLN() {
            return LN;
        }

        public void setLN(String LN) {
            this.LN = LN;
        }

        public int getSid() {
            return Sid;
        }

        public void setSid(int sid) {
            Sid = sid;

        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            //this.gpa = gpa;
            if(gpa >= 0.0 && gpa <= 4.0 ) {
                this.gpa = gpa;
            } else {
                System.out.println("Invalid GPA Value");

            }
        }
}
