﻿class Subway {
    int line;
    void run() {    System.out.println("3 lines runs");
    }
}
Subway mySub=new Subway();
mySub.run()

class Subway {
    int line;
    void run() {    System.out.println(line+"  lines runs");
    }
    void setLine(int l)  {
        line=l;
    }
}
Subway mySub=new Subway();
mySub.setLine(6);
mySub.run();