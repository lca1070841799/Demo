package sqlparser;

public class DeleteDatabaseSqlParser extends BaseSingleSqlParser {
    public DeleteDatabaseSqlParser(String originalSql) {
        super(originalSql);
    }
    @Override
    protected void initializeSegments() {

        segments.add(new SqlSegment("(delete database)(.+)( ENDOFSQL)","[,]"));

    }
}
