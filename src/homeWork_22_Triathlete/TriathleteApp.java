package homeWork_22_Triathlete;

public class TriathleteApp {


        public static void main(String[] args) {
            Triathlete triathlete = new Triathlete();
            triathlete.startSwim();
            triathlete.swim();
            triathlete.rebbitSwim();
            triathlete.stopSwim();

            triathlete.startTraining();
            triathlete.training();
            triathlete.stopTraining();

            triathlete.startRun();
            triathlete.run();
            triathlete.stopRun();
        }
    }

