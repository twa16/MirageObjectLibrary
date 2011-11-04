/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manuwebdev.mirageobjectlibrary.Alarm;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Manuel Gauto
 */
public class AlarmPacket implements Serializable{
    ArrayList<Alarm> a=new ArrayList<Alarm>();
    public AlarmPacket(ArrayList<Alarm> alarms){
        a=alarms;
    }
    public ArrayList<Alarm> getAlarms(){
        return a;
    }
}
