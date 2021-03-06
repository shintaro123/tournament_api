package club.uctennis.tournament.resolvers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import club.uctennis.tournament.services.TournamentService;
import club.uctennis.tournament.types.Tournament;

/**
 * GraphQL取得系メソッド一覧.
 *
 * @author uchiyama-shintaro
 *
 */
@Component
public class Query implements GraphQLQueryResolver {

  @Autowired
  private TournamentService tournamentService;

  /**
   * トーナメント一覧情報取得
   *
   * @return
   */
  public List<Tournament> getTournaments() {
    return tournamentService.getTournaments();
  }
}
