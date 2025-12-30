import java.util.Scanner;
public class TemperatureLogger {
    private final String []daysLabel = {"Sunday", "Monday", "Tueday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private double []daysTemp = new double[7];
    private String []status = new String[7];


    private String getStatus(double temperature) {
        if (temperature > 30) {
            return "Hot";
        } else if (temperature >= 25) {
            return "Warm";
        } else if (temperature >= 16) {
            return "Room Temp";
        } else if (temperature >= 0) {
            return "Cold";
        } else {
            return "Freezing";
        }
    }

    private double getMaxTemperature() {
        double maxTemp = daysTemp[0];

        for (double temp : daysTemp) {
            if (temp > maxTemp) {
                maxTemp = temp;
            }
        }

        return maxTemp;
    }

    private double getAverageTemperature() {
        double sumOfTemperature = 0;

        for (double temp : daysTemp) {
            sumOfTemperature += temp;
        }

        return sumOfTemperature / 7;
    }

    private void setData(Scanner input) {
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter temperature on " + daysLabel[i] + ": ");
            daysTemp[i] = input.nextDouble();
            status[i] = getStatus(daysTemp[i]);
        }
    }

    private void showData() {
        System.out.println("┌───────────┬───────────┬───────────┐");
        System.out.printf("│ %-9s │ %-9s │ %-9s │\n","Day","Temp","Status");
        System.out.println("├───────────┼───────────┼───────────┤");
        for (int i = 0; i < 7; i++) {
            System.out.printf("│ %-9s │ %-9.2f │ %-9s │\n",daysLabel[i],daysTemp[i],status[i]);
        }
        System.out.println("├───────────┴───────────┼───────────┤");
        System.out.printf("│ Average Temperature   │ %-9.2f │\n",getAverageTemperature());
        System.out.println("├───────────────────────┼───────────┤");
        System.out.printf("│ Max Temperature       │ %-9.2f │\n",getMaxTemperature());
        System.out.println("└───────────────────────┴───────────┘");
    }

    public void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("Temperature Logger System");
        setData(input);
        showData();
        input.close();
    }
    public static void main(String[] args) {
        TemperatureLogger logger = new TemperatureLogger();
        logger.start();
    }
}
