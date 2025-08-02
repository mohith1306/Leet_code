class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);

        Set<Integer> passengerSet = new HashSet<>();
        for (int p : passengers) {
            passengerSet.add(p);
        }

        int index = 0;
        int n = passengers.length;
        int lastBusTime = buses[buses.length - 1];
        int peopleOnLastBus = 0;
        List<Integer> lastBusPassengers = new ArrayList<>();

        for (int i = 0; i < buses.length; i++) {
            int capa = 0;
            while (index < n && passengers[index] <= buses[i] && capa < capacity) {
                if (i == buses.length - 1) {
                    lastBusPassengers.add(passengers[index]);
                    peopleOnLastBus++;
                }
                index++;
                capa++;
            }
        }
        if (peopleOnLastBus < capacity && !passengerSet.contains(lastBusTime)) {
            return lastBusTime;
        }
        int time = lastBusPassengers.isEmpty() ? lastBusTime : lastBusPassengers.get(lastBusPassengers.size() - 1) - 1;

        while (time >= 0) {
            if (!passengerSet.contains(time)) {
                return time;
            }
            time--;
        }

        return -1;
    }
}
