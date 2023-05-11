
public class ThisTest {
    public void mani(String[] args) {
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());
    }


    class  SimpleTime { //non-public class
        private int hour;
        private int minute;
        private int second;

        public SimpleTime(int hora, int minuto, int segundo){
            hour = hora;
            minute = minuto;
            second = segundo;
        }

        //omitindo o construtor
        public String buildString() {
            return String.format("Time: %s%n", this.toUniversalString());
        }

        public String toUniversalString() {
            return String.format("%02d:%02d:%02d", hour, minute, second);
        }
    }
}