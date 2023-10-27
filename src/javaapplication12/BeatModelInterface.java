/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author usuario
 */
public interface BeatModelInterface {
    void initialize();
    
    void on();
    
    void off();
    
    void setBPM(int bpm);
    
    int getBPM();
    
    void registerObserver(BeatObserver o);    
    
    void removeObserver(BeatObserver o);
    
    void registerObserver(BPMObserver o);
    
    void removeObserver(BPMObserver o);
}
