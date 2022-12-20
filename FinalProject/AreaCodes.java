package FinalProject;

public class AreaCodes {
    
    private String givenNumber = "";

    public AreaCodes(){

    }

    //generates an area code based off the state
    public String giveNumber(String n){
        //STEP 1: for the following missing conditions (area codes 001-034), fill in the appropriate boolean expression
        if (/*TO DO: insert boolean that checks if the parameter String n is equivalent to "NEW HAMPSHIRE"*/){ //001-003
            givenNumber = "00";
            givenNumber += (int)(Math.random()*4);
            return givenNumber;
        } else if (/*TO DO: insert boolean that checks if the parameter String n is equivalent to "MAINE"*/){ //004-007
            givenNumber = "00";
            givenNumber += (int)(Math.random()*4)+4;
            return givenNumber;
        } else if (/*TO DO: insert boolean that checks if the parameter String n is equivalent to "VERMONT"*/){ //008-009
            givenNumber = "00";
            givenNumber += (int)(Math.random()*2)+8;
            return givenNumber;
        } else if (/*TO DO: insert boolean that checks if the parameter String n is equivalent to "MASSACHUSETTS"*/){ //010-034
            givenNumber = "0";
            givenNumber += (int)(Math.random()*25)+10;
            return givenNumber;
        } else if (n.equals("RHODE ISLAND")){ //035-039
            givenNumber = "0";
            givenNumber += (int)(Math.random()*5)+35;
            return givenNumber;
        } else if (n.equals("CONNECTICUT")){ //040-049
            givenNumber = "0";
            givenNumber += (int)(Math.random()*10)+40;
            return givenNumber;
        } else if (n.equals("NEW YORK")){ //050-134
            double chance = Math.random()*1;
            if (chance < 0.5){
                givenNumber = "0";
                givenNumber += (int)(Math.random()*50)+50;
                return givenNumber;
            } else {
                givenNumber += (int)(Math.random()*35)+100;
                return givenNumber;
            }
        } else if (n.equals("NEW JERSEY")){ //135-158
            givenNumber += (int)(Math.random()*24)+135;
            return givenNumber;
        } else if (n.equals("PENNSYLVANIA")){ //159-211
            givenNumber += (int)(Math.random()*24)+135;
            return givenNumber;
        } else if (n.equals("MARYLAND")){ //212-220
            givenNumber += (int)(Math.random()*9)+212;
            return givenNumber;
        } else if (n.equals("DELAWARE")){ //221-222
            givenNumber += (int)(Math.random()*2)+221;
            return givenNumber;
        } else if (n.equals("VIRGINIA")){ //223-231
            givenNumber += (int)(Math.random()*9)+223;
            return givenNumber;
        } else if (n.equals("WEST VIRGINIA")){ //232-236
            givenNumber += (int)(Math.random()*5)+232;
            return givenNumber;
        } else if (n.equals("NORTH CAROLINA")){ //237-246
            givenNumber += (int)(Math.random()*10)+237;
            return givenNumber;
        } else if (n.equals("SOUTH CAROLINA")){ //247-251
            givenNumber += (int)(Math.random()*5)+247;
            return givenNumber;
        } else if (n.equals("GEORGIA")){ //252-260
            givenNumber += (int)(Math.random()*9)+252;
            return givenNumber;
        } else if (n.equals("FLORIDA")){ //261-267
            givenNumber += (int)(Math.random()*7)+261;
            return givenNumber;
        } else if (n.equals("OHIO")){ //268-302
            givenNumber += (int)(Math.random()*35)+268;
            return givenNumber;
        } else if (n.equals("INDIANA")){ //303-317
            givenNumber += (int)(Math.random()*15)+303;
            return givenNumber;
        } else if (n.equals("ILLINOIS")){ //318-361
            givenNumber += (int)(Math.random()*44)+318;
            return givenNumber;
        } else if (n.equals("MICHIGAN")){ //362-386
            givenNumber += (int)(Math.random()*25)+362;
            return givenNumber;
        } else if (n.equals("WISCONSIN")){ //387-399
            givenNumber += (int)(Math.random()*13)+387;
            return givenNumber;
        } else if (n.equals("KENTUCKY")){ //400-407
            givenNumber += (int)(Math.random()*8)+400;
            return givenNumber;
        } else if (n.equals("TENNESSEE")){ //408-415
            givenNumber += (int)(Math.random()*8)+408;
            return givenNumber;
        } else if (n.equals("ALABAMA")){ //416-424
            givenNumber += (int)(Math.random()*9)+416;
            return givenNumber;
        } else if (n.equals("MISSISSIPPI")){ //425-428
            givenNumber += (int)(Math.random()*4)+425;
            return givenNumber;
        } else if (n.equals("ARKANSAS")){ //429-432
            givenNumber += (int)(Math.random()*4)+429;
            return givenNumber;
        } else if (n.equals("LOUISIANA")){ //433-439
            givenNumber += (int)(Math.random()*7)+433;
            return givenNumber;
        } else if (n.equals("OKLAHOMA")){ //440-448
            givenNumber += (int)(Math.random()*24)+440;
            return givenNumber;
        } else if (n.equals("TEXAS")){ //449-467
            givenNumber += (int)(Math.random()*19)+449;
            return givenNumber;
        } else if (n.equals("MINNESOTA")){ //468-477
            givenNumber += (int)(Math.random()*10)+468;
            return givenNumber;
        } else if (n.equals("IOWA")){ //478-485
            givenNumber += (int)(Math.random()*8)+478;
            return givenNumber;
        } else if (n.equals("MISSOURI")){ //486-500
            givenNumber += (int)(Math.random()*5)+486;
            return givenNumber;
        } else if (n.equals("NORTH DAKOTA")){ //501-502
            givenNumber += (int)(Math.random()*2)+501;
            return givenNumber;
        } else if (n.equals("SOUTH DAKOTA")){ //503-504
            givenNumber += (int)(Math.random()*2)+503;
            return givenNumber;
        } else if (n.equals("NEBRASKA")){ //505-508
            givenNumber += (int)(Math.random()*4)+505;
            return givenNumber;
        } else if (n.equals("KANSAS")){ //509-515
            givenNumber += (int)(Math.random()*7)+509;
            return givenNumber;
        } else if (n.equals("MONTANA")){ //516-517
            givenNumber += (int)(Math.random()*2)+516;
            return givenNumber;
        } else if (n.equals("IDAHO")){ //518-519
            givenNumber += (int)(Math.random()*2)+518;
            return givenNumber;
        } else if (n.equals("WYOMING")){ //520
            return "520";
        } else if (n.equals("COLORADO")){ //521-524
            givenNumber += (int)(Math.random()*4)+521;
            return givenNumber;
        } else if (n.equals("NEW MEXICO")){ //525, 585
            double chance = Math.random()*1;
            if (chance < 0.5){
                return "525";
            } else {
                return "585";
            } 
        } else if (n.equals("ARIZONA")){ //526-527
            givenNumber += (int)(Math.random()*2)+526;
            return givenNumber;
        } else if (n.equals("UTAH")){ //528-529
            givenNumber += (int)(Math.random()*2)+528;
            return givenNumber;
        } else if (n.equals("NEVADA")){ //530
            return "530";
        } else if (n.equals("WASHINGTON")){ //531-539
            givenNumber += (int)(Math.random()*9)+531;
            return givenNumber;
        } else if (n.equals("OREGON")){ //540-544
            givenNumber += (int)(Math.random()*5)+540;
            return givenNumber;
        } else if (n.equals("CALIFORNIA")){ //545-573
            givenNumber += (int)(Math.random()*29)+545;
            return givenNumber;
        } else if (n.equals("ALASKA")){ //574
            return "574";
        } else if (n.equals("HAWAII")){ //575-576
            givenNumber += (int)(Math.random()*2)+575;
            return givenNumber;
        } else if (n.equals("DISTRICT OF COLUMBIA")){ //577-579
            givenNumber += (int)(Math.random()*3)+577;
            return givenNumber;
        } else if (n.equals("PUERTO RICO")){ //580-584
            givenNumber += (int)(Math.random()*5)+580;
            return givenNumber;
        } else {
            return "9999"; //if invalid input
        }
    }

    //returns the state/territory according to the area code value
    //STEP 2: for the following missing conditions (states: New Hampshire, Maine, Vermont, Massachusetts, Wyoming (further down)), fill in the appropriate boolean expression
    public String giveState(int n){
        if (/*TO DO: insert boolean that checks if the value of parameter int n is 1-3*/){ //New Hampshire
            return "New Hampshire";
        } else if (/*TO DO: insert boolean that checks if the value of parameter int n is 4-7*/){ //Maine
            return "Maine";
        } else if (/*TO DO: insert boolean that checks if the value of parameter int n is 8-9*/){ //Vermont
            return "Vermont";
        } else if (/*TO DO: insert boolean that checks if the value of parameter int n is 10-34*/){ //Massachusetts
            return "Massachusetts";
        } else if (n>=35 && n<=39){ //Rhode Island
            return "Rhode Island";
        } else if (n>=40 && n<=49){ //Connecticut
            return "Connecticut";
        } else if (n>=50 && n<=134){ //New York
            return "New York";
        } else if (n>=135 && n<=158){ //New Jersey
            return "New Jersey";
        } else if (n>=159 && n<=211){ //Pennsylvania
            return "Pennsylvania";
        } else if (n>=212 && n<=220){ //Maryland
            return "Maryland";
        } else if (n>=221 && n<=222){ //Delaware
            return "Delaware";
        } else if (n>=223 && n<=231){ //Virginia
            return "Virginia";
        } else if (n>=232 && n<=236){ //West Virginia
            return "West Virginia";
        } else if (n>=237 && n<=246){ //North Carolina
            return "North Carolina";
        } else if (n>=247 && n<=251){ //South Carolina
            return "South Carolina";
        } else if (n>=252 && n<=260){ //Georgia
            return "Georgia";
        } else if (n>=261 && n<=267){ //Florida
            return "Florida";
        } else if (n>=268 && n<=302){ //Ohio
            return "Ohio";
        } else if (n>=303 && n<=317){ //Indiana 
            return "Indiana";
        } else if (n>=318 && n<=361){ //Illinois
            return "Illinois";
        } else if (n>=362 && n<=386){ //Michigan
            return "Michigan";
        } else if (n>=387 && n<=399){ //Wisconsin
            return "Wsiconsin";
        } else if (n>=400 && n<=407){ //Kentucky
            return "Kentucky";
        } else if (n>=408 && n<=415){ //Tennessee
            return "Tennessee";
        } else if (n>=416 && n<=424){ //Alabama
            return "Alabama";
        } else if (n>=425 && n<=428){ //Mississippi
            return "Mississippi";
        } else if (n>=429 && n<=432){ //Arkansas
            return "Arkansas";
        } else if (n>=433 && n<=439){ //Louisiana
            return "Louisiana";
        } else if (n>=440 && n<=448){ //Oklahoma
            return "Oklahoma";
        } else if (n>=449 && n<=467){ //Texas
            return "Texas";
        } else if (n>=468 && n<=477){ //Minnesota
            return "Minnesota";
        } else if (n>=478 && n<=485){ //Iowa
            return "Iowa";
        } else if (n>=486 && n<=500){ //Missouri
            return "Missouri";
        } else if (n>=501 && n<=502){ //North Dakota
            return "North Dakota";
        } else if (n>=503 && n<=504){ //South Dakota
            return "South Dakota";
        } else if (n>=505 && n<=508){ //Nebraska
            return "Nebraska";
        } else if (n>=509 && n<=515){ //Kansas
            return "Kansas";
        } else if (n>=516 && n<=517){ //Montana
            return "Montana";
        } else if (n>=518 && n<=519){ //Idaho
            return "Idaho";
        } else if (/*TO DO: insert boolean that checks if the value of parameter int n is 520*/){ //Wyoming
            return "Wyoming";
        } else if (n>=521 && n<=524){ //Colorado
            return "Colorado";
        } else if (n==525 || n==585){ //New Mexico
            return "New Mexico";
        } else if (n>=526 && n<=527){ //Arizona
            return "Arizona";
        } else if (n>=528 && n<=529){ //Utah
            return "Utah";
        } else if (n==530){ //Nevada
            return "Nevada";
        } else if (n>=531 && n<=539){ //Washington
            return "Washington";
        } else if (n>=540 && n<=544){ //Oregon
            return "Oregon";
        } else if (n>=545 && n<=573){ //California
            return "California";
        } else if (n==574){ //Alaska
            return "Alaska";
        } else if (n>=575 && n<=576){ //Hawaii
            return "Hawaii";
        } else if (n>=577 && n<=579){ //District of Columbia
            return "District of Columbia";
        } else if (n>=580 && n<=584){ //Puerto Rico
            return "Puerto Rico";
        } else {
            return "ERR"; //if invalid input
        }
    }
}