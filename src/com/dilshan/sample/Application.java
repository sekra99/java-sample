package com.dilshan.sample;



import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
   /*     List<String> students=new ArrayList<>();

        students.add("Saman");
        students.add("Nimal");
        students.add("Kamal");
        students.add("Amal");
        students.add("Sunimal");
        System.out.println(students);

        List<String> filterdata=students.stream().filter(s->s.length()>5).collect(Collectors.toList());
        System.out.println(filterdata);
    */

List<Sensor> sensors= new ArrayList<>();

        Sensor sensor1 = new Sensor("Living room",45);
        Sensor sensor2 = new Sensor("bath room",55);
        Sensor sensor3 = new Sensor("lili room",30);
        Sensor sensor4 = new Sensor("Lig room",65);
        Sensor sensor5 = new Sensor("Ligg room",75);

        List<Sensor> hotsensors=sensors.stream().filter(sensor -> sensor.getValue()>35).collect(Collectors.toList());
        System.out.println(hotsensors);
}
    }



