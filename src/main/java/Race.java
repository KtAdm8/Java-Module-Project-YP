public class Race {
    private Car leader;

    public void findLeader(Car[] cars) {
        for (Car car : cars) {
            if (leader == null || car.getDistanceIn24Hours() > leader.getDistanceIn24Hours()) {
                leader = car;
            }
        }
    }

    public Car getLeader() {
        return leader;
    }
}
