# サンプルの説明
SpringBootでセッション情報をAPサーバではなくDBに保持する場合のサンプルです。
DBはH2（インメモリDB）使ってるのでDBの準備は不要です。

# サンプル実行方法
1. プロジェクトをローカルにチェックアウトする
1. コマンドプロンプトでプロジェクト直下に移動し以下のコマンドを実行  
`gradlew bootJar`
1. プロジェクト直下のbuild\libsディレクトリにdb-session.jarが作成されていることを確認
1. 以下のコマンドでjarを実行する  
`java -jar db-session.jar`
1. 以下のurlにアクセスする  
`http://localhost:8080/test`

# セッション情報の確認方法
1. 以下のurlにアクセスする  
`http://localhost:8080/h2-console`
1. 各入力項目に以下の値を入力して「Connect」ボタン押下  
Driver Class: org.h2.Driver  
JDBC URL: jdbc:h2:mem:testdb  
User Name: sa  
Password: (空欄)
1. `SPRING_SESSION`、`SPRING_SESSION_ATTRIBUTE`テーブルにセッション情報が保持されている。
