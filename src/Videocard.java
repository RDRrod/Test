/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rexdou
 */
public class Videocard {
    private int videoid;
    private String model, manufacture;
    private int graphic_cores;
    private int memory_size;
    private int price;
    private int perfomance;
    private int tdp;
    private int count;
    private int overall;
    
    public Videocard(int VideoId, String Manufacture, String Model, int Graphic_cores, int Memory_size, int Price, int Perfomance, int Tdp, int Count){
        this.videoid=VideoId;
        this.manufacture=Manufacture;
        this.model=Model;
        this.graphic_cores=Graphic_cores;
        this.memory_size=Memory_size;
        this.price=Price;
        this.perfomance=Perfomance;
        this.tdp=Tdp;
        this.count=Count;
    }
    
    public Videocard(String Manufacture, String Model, int Perfomance, int Count, int Overall){
        this.manufacture=Manufacture;
        this.model=Model;
        this.perfomance=Perfomance;
        this.count=Count;
        this.overall=Overall;
    }

    public int getVideoid() {
        return videoid;
    }

    public String getManufacture() {
        return manufacture;
    }
    

    public String getModel() {
        return model;
    }

    public int getGraphic_cores() {
        return graphic_cores;
    }

    public int getMemory_size() {
        return memory_size;
    }

    public int getPrice() {
        return price;
    }

    public int getPerfomance() {
        return perfomance;
    }

    public int getTdp() {
        return tdp;
    }

    public int getCount() {
        return count;
    }

    public int getOverall() {
        return overall;
    }
    
    
    
    
    
    
}
//
//class Nvidia extends Videocard{
//    public String Manufacture;
//    public Nvidia(int VideoId, String Model, int Graphic_cores, int Memory_size, int Price, int Perfomance, int Tdp) {
//        super(VideoId, Model, Graphic_cores, Memory_size, Price, Perfomance, Tdp);
//        
//       
//    @Override
//    public void chechPerfomance(){
//        super.chechPerfomance();
//        perfomance;
//    }
//        
//    }
//    
//}
