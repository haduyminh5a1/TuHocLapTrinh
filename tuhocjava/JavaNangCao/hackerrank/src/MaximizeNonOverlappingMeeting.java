import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

// Lớp chứa logic giải quyết bài toán: Tối đa hóa số cuộc họp không trùng lặp
class Result {

    /*
     * Hàm tìm số lượng tối đa các cuộc họp không bị chồng chéo.
     * meetings: List<List<Integer>> trong đó mỗi List<Integer> là [thời gian_bắt_đầu, thời gian_kết_thúc].
     */
    public static int maximizeNonOverlappingMeetings(List<List<Integer>> meetings) {
        if (meetings == null || meetings.isEmpty()) {
            return 0;
        }

        // 1. Sắp xếp các cuộc họp theo thời gian KẾT THÚC tăng dần (Chiến lược tham lam)
        // meeting.get(1) là thời gian kết thúc.
        Collections.sort(meetings, Comparator.comparingInt(meeting -> meeting.get(1)));

        int count = 0;
        // lastFinishTime lưu thời gian kết thúc của cuộc họp được chọn gần nhất.
        int lastFinishTime = Integer.MIN_VALUE;

        // 2. Lặp và chọn các cuộc họp không trùng lặp
        for (List<Integer> meeting : meetings) {
            int startTime = meeting.get(0);
            int endTime = meeting.get(1);

            // Kiểm tra xem cuộc họp hiện tại có BẮT ĐẦU sau hoặc bằng
            // thời gian KẾT THÚC của cuộc họp đã chọn gần nhất hay không.
            if (startTime >= lastFinishTime) {
                // Chọn cuộc họp này
                count++;
                // Cập nhật thời gian kết thúc mới
                lastFinishTime = endTime;
            }
        }

        return count;
    }
}

// Lớp chính chứa hàm main và phần đọc/ghi dữ liệu
public class MaximizeNonOverlappingMeeting {
    public static void main(String[] args) throws IOException {
        // Khai báo để có thể sử dụng các hàm collect(toList()), v.v.
        // Chỉ cần thiết nếu bạn không sử dụng static import ở trên
        // import static java.util.stream.Collectors.toList;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Đọc số hàng (số lượng cuộc họp)
        int meetingsRows = Integer.parseInt(bufferedReader.readLine().trim());
        // Đọc số cột (chủ yếu chỉ là 2: start và end, nhưng vẫn đọc để tuân thủ mẫu)
        // int meetingsColumns = Integer.parseInt(bufferedReader.readLine().trim());
        // -> Có thể bỏ qua dòng này nếu biết chắc là 2 cột

        List<List<Integer>> meetings = new ArrayList<>();

        // Đọc dữ liệu cho từng cuộc họp
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

        // Gọi hàm giải quyết bài toán
        int result = Result.maximizeNonOverlappingMeetings(meetings);

        // In kết quả
        System.out.println(result);

        bufferedReader.close();
    }
}