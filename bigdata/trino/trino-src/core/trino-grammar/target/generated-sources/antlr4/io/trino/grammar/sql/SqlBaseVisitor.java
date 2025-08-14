// Generated from io/trino/grammar/sql/SqlBase.g4 by ANTLR 4.13.2
package io.trino.grammar.sql;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlBaseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlBaseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(SqlBaseParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#standaloneExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneExpression(SqlBaseParser.StandaloneExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#standalonePathSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalonePathSpecification(SqlBaseParser.StandalonePathSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#standaloneType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneType(SqlBaseParser.StandaloneTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#standaloneRowPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneRowPattern(SqlBaseParser.StandaloneRowPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#standaloneFunctionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneFunctionSpecification(SqlBaseParser.StandaloneFunctionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefault(SqlBaseParser.StatementDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code use}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(SqlBaseParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createCatalog}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateCatalog(SqlBaseParser.CreateCatalogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropCatalog}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropCatalog(SqlBaseParser.DropCatalogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createSchema}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSchema(SqlBaseParser.CreateSchemaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropSchema}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropSchema(SqlBaseParser.DropSchemaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameSchema}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameSchema(SqlBaseParser.RenameSchemaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableAsSelect}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableAsSelect(SqlBaseParser.CreateTableAsSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(SqlBaseParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(SqlBaseParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertInto}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertInto(SqlBaseParser.InsertIntoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delete}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(SqlBaseParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(SqlBaseParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentTable(SqlBaseParser.CommentTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentView}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentView(SqlBaseParser.CommentViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentColumn}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentColumn(SqlBaseParser.CommentColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(SqlBaseParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumn(SqlBaseParser.AddColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameColumn}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameColumn(SqlBaseParser.RenameColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropColumn}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropColumn(SqlBaseParser.DropColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setColumnType}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetColumnType(SqlBaseParser.SetColumnTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropNotNullConstraint}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropNotNullConstraint(SqlBaseParser.DropNotNullConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableProperties(SqlBaseParser.SetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableExecute}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExecute(SqlBaseParser.TableExecuteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setAuthorization}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAuthorization(SqlBaseParser.SetAuthorizationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze(SqlBaseParser.AnalyzeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createMaterializedView}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateMaterializedView(SqlBaseParser.CreateMaterializedViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(SqlBaseParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshMaterializedView}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshMaterializedView(SqlBaseParser.RefreshMaterializedViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropMaterializedView}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropMaterializedView(SqlBaseParser.DropMaterializedViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameMaterializedView}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameMaterializedView(SqlBaseParser.RenameMaterializedViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setMaterializedViewProperties}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetMaterializedViewProperties(SqlBaseParser.SetMaterializedViewPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropView(SqlBaseParser.DropViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameView}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameView(SqlBaseParser.RenameViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshView}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshView(SqlBaseParser.RefreshViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code call}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(SqlBaseParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(SqlBaseParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(SqlBaseParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createBranch}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateBranch(SqlBaseParser.CreateBranchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropBranch}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropBranch(SqlBaseParser.DropBranchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fastForwardBranch}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFastForwardBranch(SqlBaseParser.FastForwardBranchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showBranches}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowBranches(SqlBaseParser.ShowBranchesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createRole}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRole(SqlBaseParser.CreateRoleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropRole}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRole(SqlBaseParser.DropRoleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grantRoles}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantRoles(SqlBaseParser.GrantRolesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grantPrivileges}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantPrivileges(SqlBaseParser.GrantPrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code revokeRoles}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeRoles(SqlBaseParser.RevokeRolesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code revokePrivileges}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokePrivileges(SqlBaseParser.RevokePrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deny}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeny(SqlBaseParser.DenyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setRole}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetRole(SqlBaseParser.SetRoleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showGrants}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowGrants(SqlBaseParser.ShowGrantsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(SqlBaseParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explainAnalyze}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainAnalyze(SqlBaseParser.ExplainAnalyzeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTable(SqlBaseParser.ShowCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateSchema}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateSchema(SqlBaseParser.ShowCreateSchemaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateView}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateView(SqlBaseParser.ShowCreateViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateMaterializedView}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateMaterializedView(SqlBaseParser.ShowCreateMaterializedViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateFunction}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateFunction(SqlBaseParser.ShowCreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(SqlBaseParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showSchemas}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSchemas(SqlBaseParser.ShowSchemasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCatalogs}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCatalogs(SqlBaseParser.ShowCatalogsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(SqlBaseParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showStats}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowStats(SqlBaseParser.ShowStatsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showStatsForQuery}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowStatsForQuery(SqlBaseParser.ShowStatsForQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showRoles}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowRoles(SqlBaseParser.ShowRolesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showRoleGrants}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowRoleGrants(SqlBaseParser.ShowRoleGrantsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctions(SqlBaseParser.ShowFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showSession}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSession(SqlBaseParser.ShowSessionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setSessionAuthorization}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSessionAuthorization(SqlBaseParser.SetSessionAuthorizationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resetSessionAuthorization}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetSessionAuthorization(SqlBaseParser.ResetSessionAuthorizationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setSession}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSession(SqlBaseParser.SetSessionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resetSession}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetSession(SqlBaseParser.ResetSessionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code startTransaction}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartTransaction(SqlBaseParser.StartTransactionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commit}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit(SqlBaseParser.CommitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rollback}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback(SqlBaseParser.RollbackContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prepare}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepare(SqlBaseParser.PrepareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deallocate}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocate(SqlBaseParser.DeallocateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execute}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(SqlBaseParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code executeImmediate}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteImmediate(SqlBaseParser.ExecuteImmediateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeInput}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeInput(SqlBaseParser.DescribeInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeOutput}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeOutput(SqlBaseParser.DescribeOutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setPath}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetPath(SqlBaseParser.SetPathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTimeZone}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTimeZone(SqlBaseParser.SetTimeZoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code update}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(SqlBaseParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code merge}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge(SqlBaseParser.MergeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#rootQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootQuery(SqlBaseParser.RootQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#rootQueryWithSession}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootQueryWithSession(SqlBaseParser.RootQueryWithSessionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#sessionProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSessionProperty(SqlBaseParser.SessionPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SqlBaseParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#with}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith(SqlBaseParser.WithContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#tableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElement(SqlBaseParser.TableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(SqlBaseParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#likeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeClause(SqlBaseParser.LikeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(SqlBaseParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#propertyAssignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignments(SqlBaseParser.PropertyAssignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(SqlBaseParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultPropertyValue}
	 * labeled alternative in {@link SqlBaseParser#propertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultPropertyValue(SqlBaseParser.DefaultPropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonDefaultPropertyValue}
	 * labeled alternative in {@link SqlBaseParser#propertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonDefaultPropertyValue(SqlBaseParser.NonDefaultPropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryNoWith(SqlBaseParser.QueryNoWithContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#orderBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderBy(SqlBaseParser.OrderByContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#limitRowCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitRowCount(SqlBaseParser.LimitRowCountContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#rowCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowCount(SqlBaseParser.RowCountContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryTermDefault(SqlBaseParser.QueryTermDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperation(SqlBaseParser.SetOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimaryDefault(SqlBaseParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table}
	 * labeled alternative in {@link SqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(SqlBaseParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTable}
	 * labeled alternative in {@link SqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(SqlBaseParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(SqlBaseParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#corresponding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorresponding(SqlBaseParser.CorrespondingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(SqlBaseParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(SqlBaseParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#groupBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupBy(SqlBaseParser.GroupByContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleGroupingSet}
	 * labeled alternative in {@link SqlBaseParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleGroupingSet(SqlBaseParser.SingleGroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code auto}
	 * labeled alternative in {@link SqlBaseParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto(SqlBaseParser.AutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rollup}
	 * labeled alternative in {@link SqlBaseParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollup(SqlBaseParser.RollupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cube}
	 * labeled alternative in {@link SqlBaseParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCube(SqlBaseParser.CubeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleGroupingSets}
	 * labeled alternative in {@link SqlBaseParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleGroupingSets(SqlBaseParser.MultipleGroupingSetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#groupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSet(SqlBaseParser.GroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#windowDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDefinition(SqlBaseParser.WindowDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#windowSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowSpecification(SqlBaseParser.WindowSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#namedQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedQuery(SqlBaseParser.NamedQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(SqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link SqlBaseParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSingle(SqlBaseParser.SelectSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link SqlBaseParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAll(SqlBaseParser.SelectAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link SqlBaseParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationDefault(SqlBaseParser.RelationDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link SqlBaseParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRelation(SqlBaseParser.JoinRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(SqlBaseParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCriteria(SqlBaseParser.JoinCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#sampledRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampledRelation(SqlBaseParser.SampledRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#sampleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleType(SqlBaseParser.SampleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#trimsSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimsSpecification(SqlBaseParser.TrimsSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#listAggOverflowBehavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAggOverflowBehavior(SqlBaseParser.ListAggOverflowBehaviorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#listaggCountIndication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaggCountIndication(SqlBaseParser.ListaggCountIndicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#patternRecognition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternRecognition(SqlBaseParser.PatternRecognitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#measureDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasureDefinition(SqlBaseParser.MeasureDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#rowsPerMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowsPerMatch(SqlBaseParser.RowsPerMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#emptyMatchHandling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyMatchHandling(SqlBaseParser.EmptyMatchHandlingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#skipTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipTo(SqlBaseParser.SkipToContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#subsetDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubsetDefinition(SqlBaseParser.SubsetDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(SqlBaseParser.VariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#aliasedRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedRelation(SqlBaseParser.AliasedRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#columnAliases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAliases(SqlBaseParser.ColumnAliasesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SqlBaseParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryRelation}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryRelation(SqlBaseParser.SubqueryRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unnest}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnest(SqlBaseParser.UnnestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lateral}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLateral(SqlBaseParser.LateralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFunctionInvocation}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFunctionInvocation(SqlBaseParser.TableFunctionInvocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedRelation}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedRelation(SqlBaseParser.ParenthesizedRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonTable}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonTable(SqlBaseParser.JsonTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ordinalityColumn}
	 * labeled alternative in {@link SqlBaseParser#jsonTableColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinalityColumn(SqlBaseParser.OrdinalityColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueColumn}
	 * labeled alternative in {@link SqlBaseParser#jsonTableColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueColumn(SqlBaseParser.ValueColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryColumn}
	 * labeled alternative in {@link SqlBaseParser#jsonTableColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryColumn(SqlBaseParser.QueryColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedColumns}
	 * labeled alternative in {@link SqlBaseParser#jsonTableColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedColumns(SqlBaseParser.NestedColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leafPlan}
	 * labeled alternative in {@link SqlBaseParser#jsonTableSpecificPlan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeafPlan(SqlBaseParser.LeafPlanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinPlan}
	 * labeled alternative in {@link SqlBaseParser#jsonTableSpecificPlan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinPlan(SqlBaseParser.JoinPlanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionPlan}
	 * labeled alternative in {@link SqlBaseParser#jsonTableSpecificPlan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionPlan(SqlBaseParser.UnionPlanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code crossPlan}
	 * labeled alternative in {@link SqlBaseParser#jsonTableSpecificPlan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossPlan(SqlBaseParser.CrossPlanContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#jsonTablePathName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonTablePathName(SqlBaseParser.JsonTablePathNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#planPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlanPrimary(SqlBaseParser.PlanPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#jsonTableDefaultPlan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonTableDefaultPlan(SqlBaseParser.JsonTableDefaultPlanContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#tableFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFunctionCall(SqlBaseParser.TableFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#tableFunctionArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFunctionArgument(SqlBaseParser.TableFunctionArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#tableArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableArgument(SqlBaseParser.TableArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableArgumentTable}
	 * labeled alternative in {@link SqlBaseParser#tableArgumentRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableArgumentTable(SqlBaseParser.TableArgumentTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableArgumentQuery}
	 * labeled alternative in {@link SqlBaseParser#tableArgumentRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableArgumentQuery(SqlBaseParser.TableArgumentQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#descriptorArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptorArgument(SqlBaseParser.DescriptorArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#descriptorField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptorField(SqlBaseParser.DescriptorFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#copartitionTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopartitionTables(SqlBaseParser.CopartitionTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SqlBaseParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(SqlBaseParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(SqlBaseParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(SqlBaseParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(SqlBaseParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(SqlBaseParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quantifiedComparison}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifiedComparison(SqlBaseParser.QuantifiedComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code between}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween(SqlBaseParser.BetweenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inList}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInList(SqlBaseParser.InListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inSubquery}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInSubquery(SqlBaseParser.InSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code like}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike(SqlBaseParser.LikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullPredicate}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullPredicate(SqlBaseParser.NullPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code distinctFrom}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctFrom(SqlBaseParser.DistinctFromContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(SqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatenation}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(SqlBaseParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(SqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(SqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atTimeZone}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtTimeZone(SqlBaseParser.AtTimeZoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(SqlBaseParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonValue}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonValue(SqlBaseParser.JsonValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literals}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(SqlBaseParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentDate}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentDate(SqlBaseParser.CurrentDateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code substring}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstring(SqlBaseParser.SubstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(SqlBaseParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(SqlBaseParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(SqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trim}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim(SqlBaseParser.TrimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parameter}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(SqlBaseParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalize}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalize(SqlBaseParser.NormalizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code localTimestamp}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTimestamp(SqlBaseParser.LocalTimestampContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonObject}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObject(SqlBaseParser.JsonObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonArray}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonArray(SqlBaseParser.JsonArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(SqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(SqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(SqlBaseParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(SqlBaseParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonExists}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonExists(SqlBaseParser.JsonExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentPath}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentPath(SqlBaseParser.CurrentPathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(SqlBaseParser.SubqueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentTime}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentTime(SqlBaseParser.CurrentTimeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code localTime}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTime(SqlBaseParser.LocalTimeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentUser}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentUser(SqlBaseParser.CurrentUserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonQuery}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonQuery(SqlBaseParser.JsonQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code measure}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasure(SqlBaseParser.MeasureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract(SqlBaseParser.ExtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayConstructor(SqlBaseParser.ArrayConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SqlBaseParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentTimestamp}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentTimestamp(SqlBaseParser.CurrentTimestampContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentSchema}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentSchema(SqlBaseParser.CurrentSchemaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(SqlBaseParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code position}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(SqlBaseParser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listagg}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListagg(SqlBaseParser.ListaggContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCase(SqlBaseParser.SearchedCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentCatalog}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentCatalog(SqlBaseParser.CurrentCatalogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupingOperation}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingOperation(SqlBaseParser.GroupingOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SqlBaseParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalLiteral(SqlBaseParser.IntervalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SqlBaseParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(SqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SqlBaseParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(SqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SqlBaseParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(SqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SqlBaseParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SqlBaseParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryLiteral}
	 * labeled alternative in {@link SqlBaseParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLiteral(SqlBaseParser.BinaryLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SqlBaseParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(SqlBaseParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#jsonPathInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonPathInvocation(SqlBaseParser.JsonPathInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#jsonValueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonValueExpression(SqlBaseParser.JsonValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#jsonRepresentation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonRepresentation(SqlBaseParser.JsonRepresentationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#jsonArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonArgument(SqlBaseParser.JsonArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#jsonExistsErrorBehavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonExistsErrorBehavior(SqlBaseParser.JsonExistsErrorBehaviorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#jsonValueBehavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonValueBehavior(SqlBaseParser.JsonValueBehaviorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#jsonQueryWrapperBehavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonQueryWrapperBehavior(SqlBaseParser.JsonQueryWrapperBehaviorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#jsonQueryBehavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonQueryBehavior(SqlBaseParser.JsonQueryBehaviorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#jsonObjectMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObjectMember(SqlBaseParser.JsonObjectMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#processingMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcessingMode(SqlBaseParser.ProcessingModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#nullTreatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullTreatment(SqlBaseParser.NullTreatmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicStringLiteral}
	 * labeled alternative in {@link SqlBaseParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicStringLiteral(SqlBaseParser.BasicStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unicodeStringLiteral}
	 * labeled alternative in {@link SqlBaseParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnicodeStringLiteral(SqlBaseParser.UnicodeStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timeZoneInterval}
	 * labeled alternative in {@link SqlBaseParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeZoneInterval(SqlBaseParser.TimeZoneIntervalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timeZoneString}
	 * labeled alternative in {@link SqlBaseParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeZoneString(SqlBaseParser.TimeZoneStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#comparisonQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonQuantifier(SqlBaseParser.ComparisonQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(SqlBaseParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(SqlBaseParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#intervalField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalField(SqlBaseParser.IntervalFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#normalForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalForm(SqlBaseParser.NormalFormContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowType}
	 * labeled alternative in {@link SqlBaseParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowType(SqlBaseParser.RowTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalType}
	 * labeled alternative in {@link SqlBaseParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalType(SqlBaseParser.IntervalTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link SqlBaseParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(SqlBaseParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doublePrecisionType}
	 * labeled alternative in {@link SqlBaseParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoublePrecisionType(SqlBaseParser.DoublePrecisionTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code legacyArrayType}
	 * labeled alternative in {@link SqlBaseParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLegacyArrayType(SqlBaseParser.LegacyArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genericType}
	 * labeled alternative in {@link SqlBaseParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericType(SqlBaseParser.GenericTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dateTimeType}
	 * labeled alternative in {@link SqlBaseParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTimeType(SqlBaseParser.DateTimeTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code legacyMapType}
	 * labeled alternative in {@link SqlBaseParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLegacyMapType(SqlBaseParser.LegacyMapTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#rowField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowField(SqlBaseParser.RowFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(SqlBaseParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(SqlBaseParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(SqlBaseParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mergeUpdate}
	 * labeled alternative in {@link SqlBaseParser#mergeCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeUpdate(SqlBaseParser.MergeUpdateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mergeDelete}
	 * labeled alternative in {@link SqlBaseParser#mergeCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeDelete(SqlBaseParser.MergeDeleteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mergeInsert}
	 * labeled alternative in {@link SqlBaseParser#mergeCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeInsert(SqlBaseParser.MergeInsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#over}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver(SqlBaseParser.OverContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#windowFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrame(SqlBaseParser.WindowFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#frameExtent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameExtent(SqlBaseParser.FrameExtentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unboundedFrame}
	 * labeled alternative in {@link SqlBaseParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnboundedFrame(SqlBaseParser.UnboundedFrameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentRowBound}
	 * labeled alternative in {@link SqlBaseParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentRowBound(SqlBaseParser.CurrentRowBoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boundedFrame}
	 * labeled alternative in {@link SqlBaseParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundedFrame(SqlBaseParser.BoundedFrameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quantifiedPrimary}
	 * labeled alternative in {@link SqlBaseParser#rowPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifiedPrimary(SqlBaseParser.QuantifiedPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code patternConcatenation}
	 * labeled alternative in {@link SqlBaseParser#rowPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternConcatenation(SqlBaseParser.PatternConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code patternAlternation}
	 * labeled alternative in {@link SqlBaseParser#rowPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternAlternation(SqlBaseParser.PatternAlternationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code patternVariable}
	 * labeled alternative in {@link SqlBaseParser#patternPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternVariable(SqlBaseParser.PatternVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyPattern}
	 * labeled alternative in {@link SqlBaseParser#patternPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyPattern(SqlBaseParser.EmptyPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code patternPermutation}
	 * labeled alternative in {@link SqlBaseParser#patternPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternPermutation(SqlBaseParser.PatternPermutationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupedPattern}
	 * labeled alternative in {@link SqlBaseParser#patternPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupedPattern(SqlBaseParser.GroupedPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionStartAnchor}
	 * labeled alternative in {@link SqlBaseParser#patternPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionStartAnchor(SqlBaseParser.PartitionStartAnchorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionEndAnchor}
	 * labeled alternative in {@link SqlBaseParser#patternPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionEndAnchor(SqlBaseParser.PartitionEndAnchorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code excludedPattern}
	 * labeled alternative in {@link SqlBaseParser#patternPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcludedPattern(SqlBaseParser.ExcludedPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code zeroOrMoreQuantifier}
	 * labeled alternative in {@link SqlBaseParser#patternQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroOrMoreQuantifier(SqlBaseParser.ZeroOrMoreQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oneOrMoreQuantifier}
	 * labeled alternative in {@link SqlBaseParser#patternQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneOrMoreQuantifier(SqlBaseParser.OneOrMoreQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code zeroOrOneQuantifier}
	 * labeled alternative in {@link SqlBaseParser#patternQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroOrOneQuantifier(SqlBaseParser.ZeroOrOneQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rangeQuantifier}
	 * labeled alternative in {@link SqlBaseParser#patternQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeQuantifier(SqlBaseParser.RangeQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#updateAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateAssignment(SqlBaseParser.UpdateAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explainFormat}
	 * labeled alternative in {@link SqlBaseParser#explainOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainFormat(SqlBaseParser.ExplainFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explainType}
	 * labeled alternative in {@link SqlBaseParser#explainOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainType(SqlBaseParser.ExplainTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isolationLevel}
	 * labeled alternative in {@link SqlBaseParser#transactionMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolationLevel(SqlBaseParser.IsolationLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code transactionAccessMode}
	 * labeled alternative in {@link SqlBaseParser#transactionMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionAccessMode(SqlBaseParser.TransactionAccessModeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readUncommitted}
	 * labeled alternative in {@link SqlBaseParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadUncommitted(SqlBaseParser.ReadUncommittedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readCommitted}
	 * labeled alternative in {@link SqlBaseParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadCommitted(SqlBaseParser.ReadCommittedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeatableRead}
	 * labeled alternative in {@link SqlBaseParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatableRead(SqlBaseParser.RepeatableReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code serializable}
	 * labeled alternative in {@link SqlBaseParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerializable(SqlBaseParser.SerializableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code positionalArgument}
	 * labeled alternative in {@link SqlBaseParser#callArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalArgument(SqlBaseParser.PositionalArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namedArgument}
	 * labeled alternative in {@link SqlBaseParser#callArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgument(SqlBaseParser.NamedArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qualifiedArgument}
	 * labeled alternative in {@link SqlBaseParser#pathElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedArgument(SqlBaseParser.QualifiedArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unqualifiedArgument}
	 * labeled alternative in {@link SqlBaseParser#pathElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedArgument(SqlBaseParser.UnqualifiedArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#pathSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathSpecification(SqlBaseParser.PathSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#functionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecification(SqlBaseParser.FunctionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(SqlBaseParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(SqlBaseParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(SqlBaseParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#returnsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnsClause(SqlBaseParser.ReturnsClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code languageCharacteristic}
	 * labeled alternative in {@link SqlBaseParser#routineCharacteristic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguageCharacteristic(SqlBaseParser.LanguageCharacteristicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deterministicCharacteristic}
	 * labeled alternative in {@link SqlBaseParser#routineCharacteristic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeterministicCharacteristic(SqlBaseParser.DeterministicCharacteristicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnsNullOnNullInputCharacteristic}
	 * labeled alternative in {@link SqlBaseParser#routineCharacteristic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnsNullOnNullInputCharacteristic(SqlBaseParser.ReturnsNullOnNullInputCharacteristicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calledOnNullInputCharacteristic}
	 * labeled alternative in {@link SqlBaseParser#routineCharacteristic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalledOnNullInputCharacteristic(SqlBaseParser.CalledOnNullInputCharacteristicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code securityCharacteristic}
	 * labeled alternative in {@link SqlBaseParser#routineCharacteristic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurityCharacteristic(SqlBaseParser.SecurityCharacteristicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentCharacteristic}
	 * labeled alternative in {@link SqlBaseParser#routineCharacteristic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentCharacteristic(SqlBaseParser.CommentCharacteristicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propertiesCharacteristic}
	 * labeled alternative in {@link SqlBaseParser#routineCharacteristic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesCharacteristic(SqlBaseParser.PropertiesCharacteristicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link SqlBaseParser#controlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SqlBaseParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link SqlBaseParser#controlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(SqlBaseParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCaseStatement}
	 * labeled alternative in {@link SqlBaseParser#controlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCaseStatement(SqlBaseParser.SimpleCaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCaseStatement}
	 * labeled alternative in {@link SqlBaseParser#controlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCaseStatement(SqlBaseParser.SearchedCaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link SqlBaseParser#controlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SqlBaseParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterateStatement}
	 * labeled alternative in {@link SqlBaseParser#controlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterateStatement(SqlBaseParser.IterateStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leaveStatement}
	 * labeled alternative in {@link SqlBaseParser#controlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeaveStatement(SqlBaseParser.LeaveStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compoundStatement}
	 * labeled alternative in {@link SqlBaseParser#controlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(SqlBaseParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopStatement}
	 * labeled alternative in {@link SqlBaseParser#controlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(SqlBaseParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link SqlBaseParser#controlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(SqlBaseParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeatStatement}
	 * labeled alternative in {@link SqlBaseParser#controlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(SqlBaseParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#caseStatementWhenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatementWhenClause(SqlBaseParser.CaseStatementWhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#elseIfClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfClause(SqlBaseParser.ElseIfClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#elseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseClause(SqlBaseParser.ElseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(SqlBaseParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#sqlStatementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatementList(SqlBaseParser.SqlStatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege(SqlBaseParser.PrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#entityKind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityKind(SqlBaseParser.EntityKindContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#grantObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantObject(SqlBaseParser.GrantObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#ownedEntityKind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwnedEntityKind(SqlBaseParser.OwnedEntityKindContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(SqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#queryPeriod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPeriod(SqlBaseParser.QueryPeriodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#rangeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeType(SqlBaseParser.RangeTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specifiedPrincipal}
	 * labeled alternative in {@link SqlBaseParser#grantor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifiedPrincipal(SqlBaseParser.SpecifiedPrincipalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentUserGrantor}
	 * labeled alternative in {@link SqlBaseParser#grantor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentUserGrantor(SqlBaseParser.CurrentUserGrantorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentRoleGrantor}
	 * labeled alternative in {@link SqlBaseParser#grantor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentRoleGrantor(SqlBaseParser.CurrentRoleGrantorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unspecifiedPrincipal}
	 * labeled alternative in {@link SqlBaseParser#principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnspecifiedPrincipal(SqlBaseParser.UnspecifiedPrincipalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code userPrincipal}
	 * labeled alternative in {@link SqlBaseParser#principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserPrincipal(SqlBaseParser.UserPrincipalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rolePrincipal}
	 * labeled alternative in {@link SqlBaseParser#principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRolePrincipal(SqlBaseParser.RolePrincipalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#privilegeOrRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeOrRole(SqlBaseParser.PrivilegeOrRoleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(SqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(SqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code backQuotedIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackQuotedIdentifier(SqlBaseParser.BackQuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code digitIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitIdentifier(SqlBaseParser.DigitIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(SqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(SqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(SqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierUser}
	 * labeled alternative in {@link SqlBaseParser#authorizationUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierUser(SqlBaseParser.IdentifierUserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringUser}
	 * labeled alternative in {@link SqlBaseParser#authorizationUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringUser(SqlBaseParser.StringUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(SqlBaseParser.NonReservedContext ctx);
}