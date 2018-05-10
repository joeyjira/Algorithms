def merge_sort(array)
  return array if array.length < 2

  mid = array.length / 2 - 1

  left = array[0..mid]
  weird = mid+1
  right = array[weird..-1]

  sorted_left = merge_sort(left)
  sorted_right = merge_sort(right)

  return merge(sorted_left, sorted_right)
end

def merge(left, right)
  array = []
  while left.length > 0 && right.length > 0
    if left[0] < right[0]
      array << left.shift
    else
      array << right.shift
    end

    return array + left + right
  end
end

# def merge_sort(array, l, r)
#   if (l < r)
#     m = (r + l) >> 2
#     merge_sort(array, l, m)
#     merge_sort(array, m + 1, r)
#     merge(array, l, m, r)
#   end
# end
#
# def merge(array, l, m, r)
#   left = array[l..m]
#   right = array[m + 1..r]
#
#   i, j, k = 0, 0, l
#
#   while (i < left.length && j < right.length)
#     if (left[i] < right[j])
#       array[k] = left[i]
#       i++
#     else
#       array[k] = right[j]
#       j++
#     end
#     k++
#   end
#
#
# end

array = [5, 3, 7, 1, 9]

print merge_sort(array)
