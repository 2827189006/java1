package gsd;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Four {//html≈≈∞Ê≤ª’˝»∑

public static void main(String[] args) {
List result = new ArrayList();
for (int i = 1; i <= 9; i++) {
for (int j = i; j <= 9; j++) {
System.out.print(i + "*" + j + "=" + i * j);
System.out.print("	");
result.add(i + "*" + j + "=" + i * j + "	");
}
System.out.println();
result.add("\r\n");
}
saveToFile(result);
}

private static void saveToFile(List result) {
File f = new File("f:/a.html");
FileWriter fw = null;
try {
fw = new FileWriter(f);
for (int i = 0; i < result.size(); i++) {
fw.write(String.valueOf(result.get(i)));
}
} catch (IOException e) {
e.printStackTrace();
} finally {
if (fw != null) {
try {
fw.flush();
fw.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}

}
}

