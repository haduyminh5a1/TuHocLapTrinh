import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result2 {

    public static int maximizeNonOverlappingMeetings(List<List<Integer>> meetings) {
        if (meetings == null || meetings.isEmpty()) {
            return 0;
        }

        // Sắp xếp các cuộc họp theo thời gian KẾT THÚC tăng dần
        Collections.sort(meetings, Comparator.comparingInt(meeting -> meeting.get(1)));

        //Bubble sort
        /*
        int n = meetings.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Lấy thời gian kết thúc của cuộc họp j và j+1
                int endTimeJ = meetings.get(j).get(1);
                int endTimeJPlus1 = meetings.get(j + 1).get(1);

                // Nếu thời gian kết thúc của cuộc họp hiện tại (j) LỚN HƠN
                // thời gian kết thúc của cuộc họp kế tiếp (j+1), thì hoán đổi chúng.
                if (endTimeJ > endTimeJPlus1) {
                    // Thực hiện hoán đổi (swap) hai cuộc họp
                    List<Integer> temp = meetings.get(j);
                    meetings.set(j, meetings.get(j + 1));
                    meetings.set(j + 1, temp);
                }
            }
        }
             */

        // Hoặc sử dụng Selection Sort như yêu cầu trước:
        /*
        int n = meetings.size();
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (meetings.get(j).get(1) < meetings.get(min_idx).get(1)) {
                    min_idx = j;
                }
            }
            if (min_idx != i) {
                List<Integer> temp = meetings.get(i);
                meetings.set(i, meetings.get(min_idx));
                meetings.set(min_idx, temp);
            }
        }
        */

        int count = 0;
        int lastFinishTime = Integer.MIN_VALUE;

        for (List<Integer> meeting : meetings) {
            int startTime = meeting.get(0);
            int endTime = meeting.get(1);

            if (startTime >= lastFinishTime) {
                count++;
                lastFinishTime = endTime;
            }
        }

        return count;
    }
}

public class MaximizeNonOverlappingMeeting2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int meetingsRows = Integer.parseInt(bufferedReader.readLine().trim());
        int meetingsColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> meetings = new ArrayList<>();

        IntStream.range(0, meetingsRows).forEach(i -> {
            try {
                meetings.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result2.maximizeNonOverlappingMeetings(meetings);

        System.out.println(result);

        bufferedReader.close();
    }
}
