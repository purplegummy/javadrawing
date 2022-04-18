class Main{
    public static void main (String [] args)
    {
      Picture pic=new Picture();
      drawCircle(pic);
      drawBridge(pic);
  
  
   }
    public static void drawCircle(Picture p) {
      
      Figure f=new Figure(400,200);
      f.drawArc(150,150, 0, 360);
      f.setLineWidth(10);
      f.setColor(Figure.BLUE);
      
      p.add(f);
      Figure a=new Figure(395,200);
      a.drawArc(145,145, 0, 360);
      a.setLineWidth(5);
      a.setColor(Figure.YELLOW);
      
      p.add(a);
      Figure z=new Figure(390,200);
      z.drawArc(140,140, 0, 360);
      
      z.setColor(Figure.BLUE);
      z.setFilled(true);
      p.add(z);
    }
    
    public static void drawBridge(Picture p) {
      Figure h = new Figure(160, 150);
      
      h.drawArc(90,-80, 0, 60);
      h.setColor(Figure.YELLOW);
      h.setLineWidth(5);
      p.add(h);
      
    }
 }