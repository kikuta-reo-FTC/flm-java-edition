# flm-java-edition

## 概要
本アプリケーションは書籍管理を行うWebシステムを提供することを目的としている。

## 構築手順
ここでは本アプリケーションの構築手順を記載する。

### 前提条件
GitHubアカウントに公開鍵を登録し、SSH接続可能な状態であること  
1. SSH接続テストを実行  
```
$ ssh -T git@github.com
```
2. 上記コマンド実行後、以下のメッセージが出力されることを確認  
```
Hi <GitHubアカウント名>! You've successfully authenticated, but GitHub does not provide shell access.
```

### アプリケーションのソースを取得  
1. 仮想環境との共有ディレクトリに移動
```
$ cd /vagrant/workspace
```
2. ソースを取得
```
$ git clone git@github.com:kikuta-reo-FTC/flm-java-edition.git ./flm-java-edition
```

### アプリケーションの初期設定
<加筆予定>

## ブランチ戦略
ここでは本開発のブランチ戦略を記載する。

### ブランチの責務
本開発では以下の3種類のブランチを使用する。  
- master  
常にリリース可能なブランチ。
- develop  
次のリリースのための最新の開発作業の変更を常に反映するブランチ。
- feature  
新機能開発用のブランチ。  
(常にdevelopから派生してdevelopにマージを行う。)
- images  
README.md用の画像保持ブランチ。
（マージを一切禁止する・）

## アーキテクチャの構成
ここでは本開発で実装対象となるアーキテクチャの構成と概要を記載する。
各レイヤの責務については各レイヤの `README.md` に説明を譲ることとする。  

### アーキテクチャ構成図  
src/  
  ├── main/java/jp/co/flm/  
  │   ├── app/ ⇒  ドメイン層への受付やUIへデータを出力するためのクラスを格納  
  │   ├── domain/ ⇒ 業務ロジックや外部APIとのやり取りをするためのクラスを格納  
  │   ├── infrastructure/ ⇒ RDBへの接続やデータの永続化をおこなうためのクラスを格納  
  │   └── FLMApplication.java ⇒ 本アプリケーションのエントリポイントとなるクラス  
  └──  test/ ⇒ テストコードを格納(テストコードの構成は `src/main` 以下と同様のフォルダ構成となる)       
build.gradle ⇒ `Gradle` によるビルド設定の定義ファイル  
settings.gradle ⇒ マルチプロジェクトに関するビルド設定の定義ファイル  

### 各レイヤのREADMEへのリンク


下記の内容は画像ブランチの初期コミットの際のテストであり今後削除予定   
![テスト画像](https://github.com/kikuta-reo-FTC/flm-java-edition/blob/images/sample.png)  