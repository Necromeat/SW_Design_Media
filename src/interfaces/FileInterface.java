/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import java.util.Date;

/**
 *
 * @author dekez
 */
public interface FileInterface {
    public String getName();
    public String getExtension();
    public Date getDate();
    public int getLength();
    public float getSize();
    public String getPath();
}
