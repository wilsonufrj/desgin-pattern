package org.command.withPattern;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        // Comandos concretos
        Command turnOn = new TurnOnLightCommand(light);
        Command turnOff = new TurnOffLightCommand(light);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Ligar a luz
        remote.setCommand(turnOn);
        remote.pressButton(); // Output: A luz está ligada

        // Desligar a luz
        remote.setCommand(turnOff);
        remote.pressButton(); // Output: A luz está desligada
    }
}
