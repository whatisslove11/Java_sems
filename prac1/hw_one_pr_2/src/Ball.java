public class Ball {
    String type;
    double PercentOfElasticity;
    double radius;

    public double getPercentOfElasticity(){
        return PercentOfElasticity;
    };

    public String getType(){
        return type;
    };

    public double getRadius(){
        return radius;
    }

    public void setPercentOfElasticity(double percentOfElasticity1){PercentOfElasticity=percentOfElasticity1;};
    public void setType (String type1){type=type1;}
    public void setRadius(double radius1){radius=radius1;}

    @Override
    public String toString(){
        String answer;
        if (radius<0.23) answer = "not big size";
        else answer = "big size";
        return ("Type of this ball - "+ type + ".\nThis ball is "+ answer);
    }
}