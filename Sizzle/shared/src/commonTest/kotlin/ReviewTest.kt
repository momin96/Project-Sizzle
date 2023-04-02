import com.momins.projectsizzle.models.Review
import com.momins.projectsizzle.models.User
import kotlin.test.Test
import kotlin.test.assertEquals

class ReviewTest {
    @Test
    fun testReviewDataClass() {
        val review = Review(
            rating = 4.5,
            comment = "Great food and service!",
            user = User(
                id = 1,
                name = "John Doe",
                email = "john.doe@example.com",
                phoneNumber = "122345"
            )
        )

        // Verify that the values are set correctly
        assertEquals(4.5, review.rating)
        assertEquals("Great food and service!", review.comment)
        assertEquals("John Doe", review.user.name)
        assertEquals("john.doe@example.com", review.user.email)
        assertEquals("122345", review.user.phoneNumber)
    }
}