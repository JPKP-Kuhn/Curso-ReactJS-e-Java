package Objetos.Sobrecargas.Objetos.Sobrecargas.Sobrecarga_de_construtores;

public class TimeCustom {
    private int hour;
    private int minute;
    private int second;

    public TimeCustom(){
        this(0, 0, 0); //atributos zerados
    }

    public TimeCustom(int hour){
        this(hour, 0, 0);
    }
    public TimeCustom(int hour, int minute){this(hour, minute, 0);}
    public TimeCustom( int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public TimeCustom(TimeCustom time){
        this(time.hour, time.minute, time.second);
    }

    public String displayTime(){
        return String.format("%02d:%02d:%02d", hour, minute, second); //cria uma string com a formatação do printf
    }
}
