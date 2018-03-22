var threeSum = function(nums) {
    let sortedNums = nums.sort(function(a,b){
            return a-b;
    });
    let result = [];

    for (let i = 0; i < sortedNums.length - 1; i++)
        {
            if (sortedNums[i] == sortedNums[i - 1] && i - 1 >= 0) continue;

            for (let j = i + 1; j < sortedNums.length; j++)
                {

                    let searchResult = binarySearch(sortedNums, j + 1, sortedNums.length - 1, (0 - sortedNums[i] - sortedNums[j]));
                    if (searchResult != null)
                            result.push([sortedNums[i], sortedNums[j], sortedNums[searchResult]]);
                }
        }

    return multiDimensionalUnique(result);
};

var binarySearch = function(array, left, right, target)
{
  let middle = left + right >>> 1;

  if (right >= left)
  {
    if (target === array[middle])
    {
      return middle;
    }
    else if (target < array[middle])
    {
      return binarySearch(array, left, middle - 1, target);
    }
    else if (target > array[middle])
    {
      return binarySearch(array, middle + 1, right, target)
    }
  }

  return null;
}

function multiDimensionalUnique(arr) {
    var uniques = [];
    var itemsFound = {};
    for(var i = 0, l = arr.length; i < l; i++) {
        var stringified = JSON.stringify(arr[i]);
        if(itemsFound[stringified]) { continue; }
        uniques.push(arr[i]);
        itemsFound[stringified] = true;
    }
    return uniques;
}
