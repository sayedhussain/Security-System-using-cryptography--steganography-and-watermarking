/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.projectUI;

/**
 *
 * @author sayed shazeb
 */

 */

/*
 *Import List
 */
import java.io.*; 

/*
 *Image_Filter Class
 */
public class Image_Filter extends javax.swing.filechooser.FileFilter
{
    
    private String extension;
    private String description;
	/*
	 *Determines if the extension is of the defined types
	 *@param ext Extension of a file
	 *@return Returns true if the extension is 'jpg' or 'png'
	 */
        public Image_Filter(String extension, String description) {
        this.extension = extension;
        this.description = description;
    }
    
	protected boolean isImageFile(String ext)
	{
		return (ext.equals("jpg")||ext.equals("png"));
	}
	
	/*
	 *Determines if the file is a directory or accepted extension
	 *@param f The File to run the directory/proper extension check on
	 *@return Returns true if the File is a directory or accepted extension
	 */
	public boolean accept(File f)
	{
	    if (f.isDirectory())
	    {
			return true;
	    }

	    String extension = getExtension(f);
		if (extension.equals("jpg")||extension.equals("png"))
		{
			return true;
		}
		return false;
	}
	
	/*
	 *Supplies File type description
	 *@return Returns the String description
	 */
	public String getDescription()
	{
		 return description + String.format(" (*%s)", extension);
	}
	
	/*
	 *Determines the Extension
	 *@param f File to return the extension of
	 *@return Returns the String representing the extension
	 */
	protected static String getExtension(File f)
	{
		String s = f.getName();
		int i = s.lastIndexOf('.');
		if (i > 0 &&  i < s.length() - 1) 
		  return s.substring(i+1).toLowerCase();
		return "";
	}
        
    
}
