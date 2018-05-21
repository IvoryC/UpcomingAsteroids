/**
 * Created by aaronyerke on 5/21/18.
 * Api Info: https://api.nasa.gov/api.html#neows-feed
 *
 */


public class NearEarthObject {

    private String neo_reference_id;
    private String name;
    private String nasa_jpl_url;
    private float absolute_magnitude_h;
    private LengthEstimate estimated_diameter;
    private boolean is_potentially_hazardous_asteroid;
    private CloseApproachData close_approach_data;
    private String orbiting_body;



    public class MissDistance{
        private float astronomical;
        private float lunar;
        private float kilometers;
        private float miles;
    }

    public class RelativeVelocity{
        private float kilometers_per_second;
        private float kilometers_per_hour;
        private float miles_per_hour;
    }

    public class CloseApproachData{
        private String close_approach_date;
        private Double epoch_date_close_approach;
        private RelativeVelocity relative_velocity;
        private MissDistance miss_distance;
    }

    public class Estimate{
        private float estimated_diameter_min;
        private float estimated_diameter_max;
    }

    public class LengthEstimate{
        private Estimate kilometers;
        private Estimate meters;
        private Estimate miles;
        private Estimate feet;
    }


}