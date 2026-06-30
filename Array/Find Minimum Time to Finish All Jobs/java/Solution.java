class Solution{
public int minimumTimeRequired(int[] jobs, int k) {
    Arrays.sort(jobs);
    var n = jobs.length;

    if (n == k)
        return jobs[n - 1];

    var low = jobs[n - 1];
    var high = Arrays.stream(jobs).sum();

    while (low < high) {

        var mid = low + (high - low >> 1);
        var workerRemainingTime = new int[k];
        Arrays.fill(workerRemainingTime, mid);

        if (isFeasible(jobs, k, workerRemainingTime, n - 1, mid))
            high = mid;
        else
            low = mid + 1;
    }

    return low;
}

private boolean isFeasible(int[] jobs, int k, int[] workerRemainingTime, int i, int maxLoadPerWorker) {
    if (i == -1)
        return true;
    for (var j = 0; j < k; j++) {
        if (workerRemainingTime[j] < jobs[i])
            continue;
        workerRemainingTime[j] -= jobs[i];
        if (isFeasible(jobs, k, workerRemainingTime, i - 1, maxLoadPerWorker))
            return true;
        workerRemainingTime[j] += jobs[i];
        if (workerRemainingTime[j] == maxLoadPerWorker)
            break;
    }

    return false;
}
}