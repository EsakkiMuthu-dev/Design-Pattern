package observerPattern;

public class UserPost {
    public static void main(String[] args) throws InterruptedException {
        RealtimeMetrics metrics = new RealtimeMetrics();
        LikePub likePub = new LikePub();
        CommentPub commentPub = new CommentPub();
        likePub.add(metrics);
        commentPub.add(metrics);
        for(int i=2;i<10;i++)
        {
            likePub.addLike();
            commentPub.addComment();
            Thread.sleep(1000);
        }

    }
}
