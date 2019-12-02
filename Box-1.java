public class Box { 
private int size; 

public Box() { 
setSize(0); 
} 

public Box(int count) { 
setSize(count); // Did I do this right? 
} 

public void setSize(int count) { 
this.size = count; 
} 

public int getSize() { 
return size; 
} 

public String toString() { 

StringBuilder sbOutput = new StringBuilder(); 
for (int line = 0; line < size; line++) { 
for (int charPosition = size; charPosition >= 0; charPosition--) {
if(charPosition >= line +1){ 
sbOutput.append("*"); 
}else{ 
sbOutput.append("#");	
} 
} 
sbOutput.append("\r\n");
} 
return sbOutput.toString(); 
} 
}