public class Computer {
    class Processor {
        private boolean isStart = false;

        public void start() {
            isStart = true;
        }

        public void shutdown() {
            isStart = false;
        }
    }

    class RAM {
        private boolean isStart = false;

        public void start() {
            isStart = true;
        }

        public void shutdown() {
            isStart = false;
        }
    }


    Processor i5 = new Processor();
    RAM kingstone = new RAM();

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.i5.start();
        computer.kingstone.start();


    }

}
