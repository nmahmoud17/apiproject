package com.detroitlabs.apiproject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



import java.util.ArrayList;


@JsonIgnoreProperties(ignoreUnknown = true)
public class MakeupRepo extends ArrayList<MakeupProduct>{


}
