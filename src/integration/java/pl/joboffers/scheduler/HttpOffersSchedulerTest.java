package pl.joboffers.scheduler;

import java.time.Duration;

import com.jobboard.JobOffersSpringBootApplication;
import com.jobboard.domain.offer.OfferFetchable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import pl.joboffers.BaseIntegrationTest;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.testcontainers.shaded.org.awaitility.Awaitility.await;

@SpringBootTest(classes = JobOffersSpringBootApplication.class, properties = "scheduling.enabled=true")
class HttpOffersSchedulerTest extends BaseIntegrationTest {

    @SpyBean
    OfferFetchable remoteOfferClient;

    @Test
    public void should_run_http_client_offers_fetching_exactly_given_times() {
        await().
                atMost(Duration.ofSeconds(2))
                .untilAsserted(() -> verify(remoteOfferClient, times(1)).fetchOffers());
    }
}
