fun makeArrayConsecutive2(statues: MutableList<Int>): Int {

    var min = statues[0];
    var max = statues[0];
    for( i in 0 until statues.size){
        if(statues[i] < min)
            min = statues[i];
        if(statues[i] > max)
            max = statues[i];
    }
    var a = max - min + 1 - statues.size;
    return a;

}