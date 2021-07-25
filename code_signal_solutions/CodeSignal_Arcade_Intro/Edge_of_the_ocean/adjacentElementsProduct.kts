fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {
    var product =inputArray[0]*inputArray[1]
    var maxProduct = product
    for( i in 1 until inputArray.size-1)
    {
        product = inputArray[i] * inputArray[i+1]
        if(product > maxProduct){
            maxProduct=product
        }

    }
    return maxProduct
}