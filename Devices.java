package Devices;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Lamp bedroomLamp = new Lamp();
    TV frontRoom = new TV();
    Radio radio = new Radio();
    
    //Lamp
    System.out.println("The bedroom lamp is currently set to " + bedroomLamp.isPower());
    bedroomLamp.switchOn();
    System.out.println("The bedroom lamp is currently set to " + bedroomLamp.isPower());
    System.out.println("The bedroom lamp is currently set to brighteness " + bedroomLamp.getBrightness());
    bedroomLamp.brighten();
    System.out.println("The bedroom lamp is currently set to brighteness " + bedroomLamp.getBrightness());
    bedroomLamp.brighten();
    System.out.println("The bedroom lamp is currently set to brighteness " + bedroomLamp.getBrightness());
    bedroomLamp.dim();
    System.out.println("The bedroom lamp is currently set to brighteness " + bedroomLamp.getBrightness());
    
    //TV
    System.out.println("The TV in the front room is currently set to " + frontRoom.isPower());
    frontRoom.switchOn();
    System.out.println("The TV in the front room is currently set to " + frontRoom.isPower());
    System.out.println("The TV in the front room is currently set to channel " + frontRoom.getChannel());
    frontRoom.channelUp();
    System.out.println("The TV in the front room is currently set to channel " + frontRoom.getChannel());
    frontRoom.channelUp();
    System.out.println("The TV in the front room is currently set to channel " + frontRoom.getChannel());
    frontRoom.channelDown();
    System.out.println("The TV in the front room is currently set to channel " + frontRoom.getChannel());
    frontRoom.setChannel();
    System.out.println("The TV in the front room is currently set to channel " + frontRoom.getChannel());
    System.out.println("The TV in the front room volume is currently set to " + frontRoom.getVolume());
    frontRoom.turnUp();
    System.out.println("The TV in the front room volume is currently set to " + frontRoom.getVolume());
    frontRoom.turnUp();
    System.out.println("The TV in the front room volume is currently set to " + frontRoom.getVolume());
    frontRoom.turnDown();
    System.out.println("The TV in the front room volume is currently set to " + frontRoom.getVolume());
    
    //Radio
    System.out.println("The radio is currently set to " + radio.isPower());
    radio.switchOn();
    System.out.println("The radio is currently set to " + radio.isPower());
    System.out.println("Current radio frequency is set to " + radio.getFrequency());
    radio.frequencyUp();
    System.out.println("Current radio frequency is set to " + radio.getFrequency());
    radio.frequencyDown();
    System.out.println("Current radio frequency is set to " + radio.getFrequency());
    radio.setFrequency();
    System.out.println("Current radio frequency is set to " + radio.getFrequency());
    System.out.println("Radio volume set to " + radio.getVolume());
    radio.turnUp();
    System.out.println("Radio volume set to " + radio.getVolume());
    radio.turnUp();
    System.out.println("Radio volume set to " + radio.getVolume());
    radio.turnDown();
    System.out.println("Radio volume set to " + radio.getVolume());
    
    System.out.println("\n");
    System.out.println("------------------------");
    System.out.println("Current Lamp Settings");
    System.out.println("Power: " + bedroomLamp.isPower());
    System.out.println("Brightness: " + bedroomLamp.getBrightness());
    System.out.println("------------------------");
    System.out.println("Current TV Settings");
    System.out.println("Power: " + frontRoom.isPower());
    System.out.println("Channel: " + frontRoom.getChannel());
    System.out.println("Volume: " + frontRoom.getVolume());
    System.out.println("------------------------");
    System.out.println("Current Radio Settings");
    System.out.println("Power: " + radio.isPower());
    System.out.println("Frequency: " + radio.getFrequency());
    System.out.println("Volume: " + radio.getVolume());
    System.out.println("------------------------");
  }
}
class Device{
  int power;
  
  Device()
  {
    power = 0;
  }
  
  int getPower()
  {
    return power;
  }

  void switchOn()
  {
    power = 1;
  }

  void switchOff()
  {
    power = 0;
  }
  
  String isPower()
  {
      if (power == 0)
        {
            return "off";
        }
        else
        {
            return "on";
        }
  }

}

class Lamp extends Device{

  int brightness;

  Lamp()
  {
    super();
    brightness = 50;
  }

  int getBrightness(){
    return brightness;
  }

  void brighten()
  {
      if (brightness < 100)
      {
          brightness += 10;
      }
    
  }

  void dim()
  {
      if (brightness > 0)
      {
          brightness -= 10;
      }
    
  }
}

class TV extends Device{

  int channel;
  int volume;

  TV(){
    super();
    channel = 1;
    volume = 20;
  }

  int getChannel()
  {
    return channel;
  }

  int getVolume()
  {
    return volume;
  }

  void turnUp()
  {
      if (volume < 50)
      {
          volume += 5;
      }
  }

  void turnDown()
  {
      if (volume > 0)
      {
          volume -= 5;
      }
  }

  void channelUp()
  {
    channel += 1;
  }

  void channelDown()
  {
    channel -= 1;
  }

  void setChannel()
    {
        Scanner chan = new Scanner(System.in);
        do {
        System.out.println("Please select channel:");
        channel = chan.nextInt();
        if (channel < 0)
        {
            System.out.println("Must be positive number");
        }
        }
        while (channel < 0);
        
    }
}

class Radio extends Device{
    
    double frequency = 0;
    int volume = 20;
    
    Radio()
    {
        super();
        frequency = 0;
        volume = 0;
    }
    
    double getFrequency()
    {
        return frequency;
    }
    
    void setFrequency()
    {
        Scanner freq = new Scanner(System.in);
        do {
        System.out.println("Please set radio frequency.");
        frequency = freq.nextDouble();
        if (frequency < 0)
        {
            System.out.println("Must be positive number");
        }
        }
        while (frequency < 0);
    }
    
    void frequencyUp()
    {
        frequency += 1;
    }
    
    void frequencyDown()
    {
        frequency -= 1;
    }
    
    int getVolume()
    {
        return volume;
    }

    void turnUp()
    {
        if (volume < 50)
        {
            volume += 5;
        }
    }

    void turnDown()
    {
      if (volume > 0)
        {
           volume -= 5;
        } 
    }
}